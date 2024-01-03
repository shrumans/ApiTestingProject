package simplilearn.p3assignment;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import registerRequestPojos.RegisterapiRequestPayload;

public abstract class Baseclasstest {

	protected RequestSpecification specwithoutlogin= new RequestSpecBuilder().setBaseUri(DataExcel.getDatafmExcel("Urlsheet", "Baseuri"))
			.setAccept(ContentType.JSON)
			.setContentType(ContentType.JSON).build().log().all();
	protected RequestSpecification specwithlogin;
	protected RequestSpecification multipartFormspec;
	
	Faker fake= new Faker();
	Gson gson=new Gson();
	String token;
	static String loginemail;
    static String loginpassword;
	
    protected static Logger log=LogManager.getLogger(Baseclasstest.class.getName());
    
	@BeforeSuite
	public void testregisterapi() {
		
		//schema
		    File regSchema=null;
			
			if(DataExcel.env.equals("prod")) {
			regSchema=new File(System.getProperty("user.dir")+File.separator+"resources"
			+File.separator+"jsonSchema"+File.separator+"registerSchemaProd.json");
			}
			else {
				regSchema=new File(System.getProperty("user.dir")+File.separator+"resources"
						+File.separator+"jsonSchema"+File.separator+"registerSchema.json");
			}
			
			String registerpayload=DataExcel.getDatafmExcel("Rpayload", "register");
			
			RegisterapiRequestPayload regpayload=gson.fromJson(registerpayload, RegisterapiRequestPayload.class);
			regpayload.getUser().setEmail(fake.internet().emailAddress());
			regpayload.getUser().setPassword(fake.internet().password());
			loginemail= regpayload.getUser().getEmail();
			loginpassword = regpayload.getUser().getPassword();
			
			given().spec(specwithoutlogin).body(gson.toJson(regpayload)).
			when().post(APIendpoints.registerAPI).
			then().statusCode(200).and().
			//body(matchesJsonSchema(regSchema)).and().
			assertThat().body("user.currency.data.attributes.name", equalTo("Indian Rupee")).
			and().time(lessThan(10000L));
		}
	
	
	@BeforeSuite(dependsOnMethods= {"testregisterapi"})
	public void testloginapi() {
		
		//schema
		  File loginschema=null;
			
			if(DataExcel.env.equals("prod")) {
			loginschema=new File(System.getProperty("user.dir")+File.separator+"resources"
			+File.separator+"jsonSchema"+File.separator+"loginSchemaProd.json");
			}
			else {
				loginschema=new File(System.getProperty("user.dir")+File.separator+"resources"
						+File.separator+"jsonSchema"+File.separator+"loginSchema.json");
			}
		
			
		String loginpayload = DataExcel.getDatafmExcel("Lpayload", "login");
		
		LinkedTreeMap<String,String> loginmap = new LinkedTreeMap<>();
		
		@SuppressWarnings("unchecked")
		LinkedTreeMap<String,String> loginpayloadmap=gson.fromJson(loginpayload,loginmap.getClass());
		loginpayloadmap.put("email",loginemail);
		loginpayloadmap.put("password",loginpassword);
		
		
		given().spec(specwithoutlogin).body(loginpayloadmap).
		when().post(APIendpoints.loginAPI).
		then().statusCode(200).and().
		//body(matchesJsonSchema(loginschema)).and().
		time(lessThan(10000L));
		
		Response response=given().spec(specwithoutlogin).body(loginpayloadmap).
				when().post(APIendpoints.loginAPI);
		
		JsonPath jsonpath= response.jsonPath();
		token = jsonpath.get("user.authtoken").toString();
		
	    Assert.assertEquals(loginemail,jsonpath.get("user.email").toString()); 
	    Assert.assertEquals(jsonpath.get("user.authtoken").toString().length() > 10, true);
	    
		specwithlogin=new RequestSpecBuilder().setBaseUri(DataExcel.getDatafmExcel("Urlsheet", "Baseuri"))
				.setAccept(ContentType.JSON)
				.setContentType(ContentType.JSON)
				.addHeader("authtoken",token).build().log().all();
		
		multipartFormspec=new RequestSpecBuilder().setBaseUri(DataExcel.getDatafmExcel("Urlsheet", "Baseuri"))
	    		   .setConfig(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().encodeContentTypeAs("multipart/form-data", ContentType.TEXT)))
	    		   .addHeader("authtoken",token).build().log().all();
	}
	
//	@AfterSuite
//	public void testlogoutapi() {
//		
//		//prod and stage schema is same
//		File logoutschema=new File(System.getProperty("user.dir")+File.separator+"resources"
//		+File.separator+"jsonSchema"+File.separator+"logoutSchemastageProd.json");
//			
//		given().spec(specwithlogin).param("authtoken",token).
//		when().delete(APIendpoints.logoutAPi).
//		then().statusCode(200).and().
//		body(matchesJsonSchema(logoutschema)).and().
//		assertThat().body("message", equalTo("Logged out successfully")).
//		and().time(lessThan(5000L));
//		
//	}
//	
}



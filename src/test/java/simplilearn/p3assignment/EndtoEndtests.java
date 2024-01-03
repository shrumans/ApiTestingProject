package simplilearn.p3assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.internal.LinkedTreeMap;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import registerRequestPojos.RegisterapiRequestPayload;

import static org.hamcrest.Matchers.lessThan;

import java.io.File;
import java.util.HashMap;

import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class EndtoEndtests extends Baseclasstest{


	@Test(priority=1)
	public void testdashboardapi() {
		
		//prod and stage schema is same
		File dashSchema=new File(System.getProperty("user.dir")+File.separator+"resources"
		+File.separator+"jsonSchema"+File.separator+"dashboardSchemaStageProd.json");
					
		
		given().spec(specwithlogin).param("status", "freemium").
		when().get(APIendpoints.dashboardAPI).
		then().statusCode(200).and().
		body(matchesJsonSchema(dashSchema)).and().
		assertThat().body("build_card_count.freemium", equalTo(0)).
		and().time(lessThan(10000l));
	}
	
	@Test
	
	public void testupdateprofileapi() {
		
		//schema
		  File updateSchema=null;
			
			if(DataExcel.env.equals("prod")) {
			updateSchema=new File(System.getProperty("user.dir")+File.separator+"resources"
			+File.separator+"jsonSchema"+File.separator+"profileSchemaProd.json");
			}
			else {
				updateSchema=new File(System.getProperty("user.dir")+File.separator+"resources"
						+File.separator+"jsonSchema"+File.separator+"profileSchemaStage.json");
			}
		
		HashMap<String,String> formparams=new HashMap<>();
		formparams.put("user[first_name]",fake.name().firstName());
		formparams.put("user[last_name]",fake.name().lastName());
		
		given().spec(multipartFormspec).formParams(formparams).
		when().put(APIendpoints.profileAPI).
		then().statusCode(200).and().
		//body(matchesJsonSchema(updateSchema)).
		and().time(lessThan(10000L));
		
		//request and response names validation
		
		System.out.println("Printing request names:"+formparams);
		
		Response response=given().config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().encodeContentTypeAs("multipart/form-data", ContentType.TEXT)))
				.spec(specwithlogin).contentType("multipart/form-data").formParams(formparams).
				when().put(APIendpoints.profileAPI);
		
		JsonPath jsonpath=response.jsonPath();
		
		Assert.assertEquals(formparams.get("user[first_name]"),jsonpath.get("user.first_name").toString());
		Assert.assertEquals(formparams.get("user[last_name]"),jsonpath.get("user.last_name").toString());
		
	    }
	
	
}
	


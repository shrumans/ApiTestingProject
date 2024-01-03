package simplilearn.p3assignment;

import static org.testng.Assert.assertEquals;
import java.util.HashMap;
import org.testng.Assert;
import org.testng.annotations.Test;
import dashboardPojos.DashboardApiResponsePojo;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import loginPojos.LoginApiRequestPojo;
import loginPojos.LoginApiResponsePojo;
import logoutPojos.LogoutApiResponsePojo;
import profilePojos.ProfileApiResponsePojo;
import static io.restassured.RestAssured.given;
import registerPojos.RegisterApiResponsePojo;
import registerRequestPojos.RegisterapiRequestPayload;

public class PojoRequestResponseClass extends Baseclasstest {

	LoginApiRequestPojo login;
	RegisterapiRequestPayload register;
	
	
	@Test(priority=1)
	public void registerApiRequestWithPojo () {
		
		String registerpayload= "{\"user\":{\"first_name\":\"Test\",\"last_name\":\"\",\"email\":\"{{$randomEmail}}\",\"password\":\"{{$randomPassword}}\",\"phone_number\":\"+91-8285408006\",\"user_type\":\"User\",\"currency_id\":1}}";
		register = gson.fromJson(registerpayload, RegisterapiRequestPayload.class);
		register.getUser().setEmail(fake.internet().emailAddress());
		register.getUser().setPassword(fake.internet().password());
		
		Response response = given().spec(specwithoutlogin).body(gson.toJson(register)).when().post(APIendpoints.registerAPI);
		JsonPath jsonPath = response.jsonPath();
		
		Assert.assertEquals(register.getUser().getEmail(), jsonPath.get("user.email").toString());
	}
	
	@Test(priority=2)
	public void registerApiResponseWithPojo() {
		
		log.info("Starting registerApi test from pojo class");
		
        String registerpayload= "{\"user\":{\"first_name\":\"Test\",\"last_name\":\"\",\"email\":\"{{$randomEmail}}\",\"password\":\"{{$randomPassword}}\",\"phone_number\":\"+91-8285408006\",\"user_type\":\"User\",\"currency_id\":1}}";
		register = gson.fromJson(registerpayload, RegisterapiRequestPayload.class);
		register.getUser().setEmail(fake.internet().emailAddress());
		register.getUser().setPassword(fake.internet().password());
		
		Response response=given().spec(specwithoutlogin).body(gson.toJson(register)).when().post(APIendpoints.registerAPI);
		
		log.debug("Json response of register api:"+response.getBody().asPrettyString());
		
		RegisterApiResponsePojo res = response.getBody().as(RegisterApiResponsePojo.class);
		 
		try {
			assertEquals(res.getUser().getCurrency().getData().getAttributes().getName(),"Indian Rupee");
		} catch (AssertionError e) {
			log.error("assertion error:Currency name is not correct");
			Assert.fail("assertion error:Currency name is not correct");
		}
		
		
	}
	
	@Test(priority=3)
	public void loginApiRequestWithPojo() {
		
		String loginpayload="{\"email\":\"{{$randomEmail}}\",\"password\":\"{{$randomPassword}}\"}";
		login = gson.fromJson(loginpayload, LoginApiRequestPojo.class);
		login.setEmail(loginemail); //used registerApi's email and password which is there in Baseclasstest.
		login.setPassword(loginpassword);
		Response response = given().spec(specwithoutlogin).body(gson.toJson(login)).when().post(APIendpoints.loginAPI);
		JsonPath jsonPath=response.jsonPath();
		
		System.out.println(login.getEmail());
		System.out.println(login.getPassword());
		
		
		Assert.assertEquals(login.getEmail(),jsonPath.get("user.email").toString());
		
	}
	
	@Test(priority=4)
	public void loginApiResponseWithPojo() {
		
		log.info("Starting loginApi test from pojo class");
		
		Response response= given().spec(specwithoutlogin).body(gson.toJson(login)).when().post(APIendpoints.loginAPI);
		log.debug("Json response of login api:"+response.getBody().asPrettyString());
		LoginApiResponsePojo lres = response.getBody().as(LoginApiResponsePojo.class);
		
		try {
			assertEquals(lres.getUser().getEmail(), loginemail);
			assertEquals(lres.getUser().getCurrency().getData().getAttributes().getCountryCode(),"IN");
		} catch (AssertionError e) {
			log.error("assertion error:Currency code is not correct");
			Assert.fail("assertion error:Currency code is not correct");
		}
		
	}
	
	@Test(priority=5)
	public void dashboardApiResponseWithPojo() {
		
		log.info("Starting dashboardApi test from pojo class");
		
		Response response=given().spec(specwithlogin).param("status", "freemium").
				when().get(APIendpoints.dashboardAPI);
		log.debug("Json response of dashboard api:"+response.getBody().asPrettyString());
		DashboardApiResponsePojo dres = response.getBody().as(DashboardApiResponsePojo.class);
		
		try {
			assertEquals(dres.getBuildCardCount().getFreemium().intValue(),0);
		} catch (AssertionError e) {
			log.error("assertion error:Freemium Buildcard count is not correct");
			Assert.fail("assertion error:Freemium Buildcard count is not correct");
		}
		
		
	}
	
	@Test(priority=6)
	public void profileApiResponseWithPojo() {
		
		log.info("Starting profileApi test from pojo class");
		
		HashMap<String,String> formparams=new HashMap<>();
		formparams.put("user[first_name]",fake.name().firstName());
		formparams.put("user[last_name]",fake.name().lastName());
		
		Response response =given().spec(multipartFormspec).formParams(formparams).when().put(APIendpoints.profileAPI);
		log.debug("Json response of profileupdate api:"+response.getBody().asPrettyString());
		ProfileApiResponsePojo pres = response.getBody().as(ProfileApiResponsePojo.class);
		
		try {
			assertEquals(pres.getUser().getFirstName(),formparams.get("user[first_name]"));
			assertEquals(pres.getUser().getLastName(),formparams.get("user[last_name]"));
		} catch (AssertionError e) {
			log.error("assertion error:firstname or lastname is not correct");
			Assert.fail("assertion error:firstname or lastname is not correct");
		}
		
		
	}
	
	@Test(priority=7)
	public void logoutApiResponseWithPojo() {
		
		log.info("Starting logoutApi test from pojo class");
		
		Response response=given().spec(specwithlogin).param("authtoken",token).
		when().delete(APIendpoints.logoutAPi);
		log.debug("Json response of logout api:"+response.getBody().asPrettyString());
		
		LogoutApiResponsePojo lres = response.getBody().as(LogoutApiResponsePojo.class);
		
		try {
			assertEquals(lres.getMessage(),"Logged out successfully");
		} catch (AssertionError e) {
			log.error("assertion error:Logout message is not correct");
			Assert.fail("assertion error:Logout message is not correct");
		}
		
		
	}
	
	
}
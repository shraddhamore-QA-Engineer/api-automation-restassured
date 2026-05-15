package testcases;

import java.util.HashMap;

import org.testng.annotations.Test;

import base.BaseClass;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
@Test
public class RegisterTest extends BaseClass {
	
	 public void registerUser() {

	        HashMap<String, String> data = new HashMap<String, String>();
			data.put("email", "eve.holt@reqres.in");
			data.put("password", "test");
			
	        Response response = 
	        RestAssured
	                .given().spec(requestSpec).contentType(ContentType.JSON).body(data)
	                .when().post("register");
	        
			System.out.println("Status Code: " + response.getStatusCode());
			System.out.println(response.getBody().asPrettyString());
	 }
}

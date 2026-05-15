package testcases;

import java.util.HashMap;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import base.BaseClass;
import io.restassured.RestAssured;

@Test
public class CreateUserTest extends BaseClass {
	public void createUser() {
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("name", "jane Doe");
		data.put("email", "jane@example.com");
		data.put("role", "admin");
		
		Response response = 
		RestAssured.given().spec(requestSpec).contentType(ContentType.JSON).body(data)
		.when().post("users");
		
		System.out.println("Status Code: " + response.getStatusCode());
		System.out.println(response.getBody().asPrettyString());
		//.then().statusCode(201).log().all();
	}
}

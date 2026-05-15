package testcases;

import java.util.HashMap;

import org.testng.annotations.Test;

import base.BaseClass;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.util.HashMap;

public class UpdateUserTest extends BaseClass {
	@Test
	public void updateUser() {
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("name", "jane Doe Updated");
		data.put("email", "jane@example.com");
		data.put("role", "admin");
		RestAssured
        .given().spec(requestSpec).contentType(ContentType.JSON).body(data)
        .when().put("users/2")
        .then().statusCode(200).log().all();
	}

}

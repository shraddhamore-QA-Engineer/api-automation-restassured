package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteUserTest extends BaseClass {
	@Test
	public void deleteUser(){
		Response response =
		RestAssured.given().spec(requestSpec)
        .contentType(ContentType.JSON)
		.when().delete("users/2");
		
		System.out.println("Status Code: " + response.getStatusCode());
	    System.out.println(response.getBody().asPrettyString());
	}

}

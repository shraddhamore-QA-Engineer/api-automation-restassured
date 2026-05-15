package testcases;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import base.BaseClass;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GetUsersTest extends BaseClass {
@Test
public void getUsersList() {
	Response response = 
	RestAssured
	.given().spec(requestSpec).contentType(ContentType.JSON)
	.when().get("users?page=2");
	System.out.println("Status Code: " + response.getStatusCode());
	System.out.println(response.getBody().asPrettyString());
}
}

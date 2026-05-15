package testcases;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
@Test
public class LoginTest extends BaseClass {
		public void loginTest() {

		HashMap<String, String> data = new HashMap<String, String>();
		data.put("email", "eve.holt@reqres.in");
		data.put("password", "cityslicka");
		
		Response response = 
        RestAssured
                .given().spec(requestSpec).contentType(ContentType.JSON).body(data)
                .when().post("login");
		
		System.out.println("Status Code: " + response.getStatusCode());
		System.out.println(response.getBody().asPrettyString());	               
    }
}

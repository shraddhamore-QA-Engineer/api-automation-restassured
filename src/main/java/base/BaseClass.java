package base;

import org.testng.annotations.BeforeClass;
import io.restassured.specification.RequestSpecification;
import io.restassured.builder.RequestSpecBuilder;
import utils.ConfigReader;

public class BaseClass {
	protected RequestSpecification requestSpec;

	@BeforeClass
	public void setup() {
		requestSpec = new RequestSpecBuilder()
				.setBaseUri(ConfigReader.get("baseUrl"))
				.addHeader("x-api-key", ConfigReader.get("header.key").toString())
				.build();
	}
}

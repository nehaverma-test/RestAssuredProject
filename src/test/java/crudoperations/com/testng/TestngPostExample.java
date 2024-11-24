package crudoperations.com.testng;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class TestngPostExample {

	static String payloadData = "{ \"username\": \"admin\", \"password\": \"password123\" }";

	@Test
	public void postFunction() {
		RequestSpecification r = RestAssured.given();
		r.baseUri("https://restful-booker.herokuapp.com/");
		r.basePath("auth");
		r.contentType(ContentType.JSON);
		r.body(payloadData);

		Response s = r.when().post();

		ValidatableResponse vd = s.then().statusCode(200).log().all();

	}

}

package crudoperations.com.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class BddStylePutRequest {

	public static void main(String[] args) {

		String payloadData = "{ \"username\": \"admin\", \"password\": \"password123\" }";

		RestAssured.given().baseUri("https://restful-booker.herokuapp.com/").basePath("auth")
				.contentType(ContentType.JSON)
				.body(payloadData).log().all()
				.when().post().then().statusCode(200).log().all();

	}

}

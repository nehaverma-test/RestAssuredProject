package crudoperations.com.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class NonBddStylePutRequest {

	static String payloadData = "{ \"username\": \"admin\", \"password\": \"password123\" }";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RequestSpecification r = RestAssured.given();
		

		r.baseUri("https://restful-booker.herokuapp.com/");
		r.basePath("auth");
		r.contentType(ContentType.JSON);
		r.body(payloadData);
		Response response = r.when().post();
		
		//Validation part
		
		ValidatableResponse vd =response.then();
		vd.statusCode(200);
		

	}

}

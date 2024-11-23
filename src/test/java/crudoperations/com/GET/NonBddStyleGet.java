package crudoperations.com.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NonBddStyleGet {

	public static void main(String[] args) {
		
		//RestAssured given part is given to Interface (RequestSpecification) reference variable r
   
		RequestSpecification r = RestAssured.given();
		r.baseUri("https://zippopotam.us/");
		r.basePath("IN/110024");
		
		//rs is reference variable of Response interface which is given when part
		// Out of request variable we fetch details using when()
		
		Response rs = r.when().get();
		
		rs.then().statusCode(200).log().all();
	}
}

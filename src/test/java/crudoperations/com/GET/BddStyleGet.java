package crudoperations.com.GET;

import io.restassured.RestAssured;

public class BddStyleGet {
	
	public static void main(String[] arg)
	{
		RestAssured.given().baseUri("https://zippopotam.us/").basePath("IN/400016").log().all()
		.when().get()
		.then().statusCode(200).log().all();
	}

}

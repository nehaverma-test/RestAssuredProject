package crudoperations.com.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NonBddStyleMultipleGetMethods {

	static RequestSpecification r = RestAssured.given();
	static Response p;

	public static void function1() {
		r.basePath("IN/110024");
		p = r.when().get();
		p.then().statusCode(200).log().all();
	}

	public static void function2() {

		r.basePath("IN/110028");
		p = r.when().get();
		p.then().log().all();

	}

	public static void main(String[] args) {

		r.baseUri("https://zippopotam.us/");
		function1();
		function2();
	}

}

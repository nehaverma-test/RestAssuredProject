package Demo.Practice;

import io.restassured.RestAssured;

public class GetRequestExample {

	public static void main(String[] args) {

  RestAssured.given().baseUri("https://restful-booker.herokuapp.com/")
  .basePath("booking/1").log().all()
  .when().get()
  .then().statusCode(200).log().all();
	}

}

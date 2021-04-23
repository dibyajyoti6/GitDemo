package api.automation.learning;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredDemo {
	@Test
	public void getRequest(){
		RestAssured.baseURI="https://reqres.in";
		//in given() method what & all is required to perform operation
		//e.g. parameters,header,cookies,body
		RestAssured.given().param("page", "2")
		.when().get("/api/users").then().assertThat().statusCode(200);
		
	}

}

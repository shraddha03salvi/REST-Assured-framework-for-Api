package getRequest;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserController_Postdata {

@Test
	public void PostData() {
	String temp="{\"emailId\":\"shraddha12salvi@gmail.com\",\"fullName\":\"Shraddha Salvi\",\"gender\":\"Female\",\"graduationYear\":\"2016\",\"phoneNumber\":\"9090904545\",\"qualification\":\"BE\"}";
		Response response =
			    (Response) RestAssured.given().
			    header("Content-Type","application/json").
			    body(temp).
				  
		when().
		post("http://34.210.101.131:8081/register").
		then().
             //statusCode(200).
			   
			    extract().response();
			    
			    
	}
}

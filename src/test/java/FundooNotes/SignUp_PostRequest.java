package FundooNotes;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SignUp_PostRequest {
	@Test
	public void postdata() {
		//RestAssured.baseURI ="http://34.210.101.131:8081/testtimes";
		RequestSpecification request = RestAssured.given();
		request.header("content type","application/json");
		JSONObject json = new JSONObject();
		
		//ADD or POST value into API
		json.put("firstName", "Shraddhaa");
		json.put("lastName", "Dhatavkarr");
		//json.put("service", "advanced");
		json.put("email", "shraddha03@gmail.com");
		json.put("password", "Shraddha@1234");
		json.put("confirmpassword", "Shraddha@1234");
		request.body(json.toJSONString());
		Response response = request.post("http://192.168.0.4:8000/api/user/userSignUp");
		int code =  response.getStatusCode();
		System.out.println("status code is"+code);
		System.out.println("Post successful");
	
	}

}

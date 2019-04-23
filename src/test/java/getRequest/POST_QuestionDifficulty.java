package getRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_QuestionDifficulty {
	@Test
	public void postdata() {
		
		RequestSpecification request = RestAssured.given();
		request.header("content type","application/json");
		JSONObject json = new JSONObject();
		
		//ADD or POST value into API
		json.put( "difficultyName", "string2");
		json.put( "marks", "2");
		json.put(  "time", "15");
		
		request.body(json.toJSONString());
		Response response = request.post("http://34.210.101.131:8081/questiondifficulties");
		int code =  response.getStatusCode();
		System.out.println("status code is"+code);
		System.out.println("Post successful");
		
	}
	@Test
	public void testbody() {
		Response resp =RestAssured.post("http://34.210.101.131:8081/questiondifficulties");
		String data = resp.asString();
		System.out.println("Data is"+data);
		System.out.println("Response time"+resp.getTime());
}}

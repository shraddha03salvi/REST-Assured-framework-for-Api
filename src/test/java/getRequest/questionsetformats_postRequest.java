package getRequest;
import java.net.MalformedURLException;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class questionsetformats_postRequest {
	@Test
	public void postdata() {
		//RestAssured.baseURI ="http://34.210.101.131:8081/questionsetformats";
	RequestSpecification request = RestAssured.given();
	request.header("content-Type","application/json");
	JSONObject json = new JSONObject();
	 json.put("complexityFourCount", 0);
	 json.put("complexityOneCount", 0);
	 json.put("complexityThreeCount",0);
	 json.put("complexityTwoCount",0);
	 json.put( "name", "String");
	 json.put("noOfProgrammingQuestion",0);
	 json.put("testDifficulty","String");
	 json.put("testTimeId", "5c87aaad4cedfd0006287522");
	 json.put("topicDifficulty",0);
	 request.body(json.toJSONString());
	 Response response = request.post("http://34.210.101.131:8081/questionsetformats");
	 int code = response.getStatusCode();
	 
	}
}

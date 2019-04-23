package getRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostData {
@Test
public void postdata() {
	//RestAssured.baseURI ="http://34.210.101.131:8081/testtimes";
	RequestSpecification request = RestAssured.given();
	request.header("content type","application/json");
	JSONObject json = new JSONObject();
	
	//ADD or POST value into API
	json.put("testName", "MCQ12");
	json.put("testTime",15);
	//json.put("testName":"string123","testTime":"30");
	//json.put("message","Test time added successfully");
	request.body(json.toJSONString());
	Response response = request.post("http://34.210.101.131:8081/testtimes");
	int code =  response.getStatusCode();
	System.out.println("status code is"+code);
	System.out.println("Post successful");
   // Assert.assertEquals("Message", expected);
	}
//For Response Body

@Test
public void testbody() {
	Response resp =RestAssured.post("http://34.210.101.131:8081/testtimes");
	String data = resp.asString();
	System.out.println("Data is"+data);
	System.out.println("Response time"+resp.getTime());

}}
//String APIBody="{\"topicComplexity\":\"5\",\"topicName\":\"MCQ\"}";
//JSONObject json="{\"testName\":\"string123\",\"testTime\":\"30\"}";
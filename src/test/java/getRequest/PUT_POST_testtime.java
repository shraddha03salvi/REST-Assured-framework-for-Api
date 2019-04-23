package getRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUT_POST_testtime {

	
	@Test
	public void update() {
	RequestSpecification request= RestAssured.given();	
	request.header("content-type","application/json");
	JSONObject json = new JSONObject();
	json.put( "testName","Python");
	json.put( "testTime", 30);
	//5c88aa7e4cedfd0006378425
	request.body(json.toJSONString());
	Response resp=request.put("http://34.210.101.131:8081/testtimes/5c88ce254cedfd000637842b");
	int code=resp.getStatusCode();
	System.out.println("Response code"+code);
	}
}

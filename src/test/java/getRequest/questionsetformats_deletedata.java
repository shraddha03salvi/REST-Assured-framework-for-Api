package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class questionsetformats_deletedata {
	@Test
	public void Delete() {
		RequestSpecification request = RestAssured.given();
		Response response =  request.delete("http://34.210.101.131:8081/questionsetformats/5c88a3454cedfd0006378422");
		int code =  response.getStatusCode();
		System.out.println("Status code is"+code);
		//Assert.assertEquals(code,200);
		System.out.println("QuestionSet Format deleted successfully");
		
	}
	//For Response Body
		@Test
		
		public void responsebody() 
		{
		Response resp =RestAssured.delete("http://34.210.101.131:8081/questionsetformats/5c88a3454cedfd0006378422");
		String data = resp.asString();
		System.out.println("Data is"+data);
		}
}

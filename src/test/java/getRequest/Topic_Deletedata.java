package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Topic_Deletedata {
	@Test
	public void Delete() {
		RequestSpecification request = RestAssured.given();
		Response response =  request.delete("http://34.210.101.131:8081/topics/5c89fa9b4cedfd0006c879b6");
		int code =  response.getStatusCode();
		System.out.println("Status code is"+code);
		Assert.assertEquals(code,200);
		System.out.println("Test time deleted successfully");
		
	}
	//For Response Body
		@Test
		
		public void responsebody() 
		{
		Response resp =RestAssured.delete("http://34.210.101.131:8081/topics/5c89fa9b4cedfd0006c879b6");
		String data = resp.asString();
		System.out.println("Data is"+data);
		}
}

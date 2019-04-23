package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteData {
@Test
public void Delete() {
	RequestSpecification request = RestAssured.given();
	Response response =  request.delete("http://34.210.101.131:8081/testtimes/5c87b1374cedfd000628753b");
	int code =  response.getStatusCode();
	System.out.println("Status code is"+code);
	Assert.assertEquals(code,200);
	System.out.println("Test time deleted successfully");
	
}
//For Response Body
	@Test
	
	public void responsebody() 
	{
	Response resp =RestAssured.delete("http://34.210.101.131:8081/testtimes/5c87b1374cedfd000628753b");
	String data = resp.asString();
	System.out.println("Data is"+data);
	}
}

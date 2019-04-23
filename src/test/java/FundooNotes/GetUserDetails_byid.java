package FundooNotes;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUserDetails_byid {
	@Test
	public void testResponsecode() {
		Response resp =RestAssured.get("http://192.168.0.4:8000/api/user/5c863d3b79a633226464749e");
		int code =  resp.getStatusCode();
		System.out.println("Status code is"+code);
		Assert.assertEquals(code,200);
	}
	@Test
	public void testbody() {
		Response resp =RestAssured.get("http://192.168.0.4:8000/api/user/5c863d3b79a633226464749e");
		String data = resp.asString();
		System.out.println("Data is"+data);
		System.out.println("Response time"+resp.getTime());
	}
}

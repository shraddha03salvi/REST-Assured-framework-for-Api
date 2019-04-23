package FundooNotes;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_Note {

	@Test
	public void testResponsecode() {
		Response resp =RestAssured.get("http://192.168.0.4:8000/api/notes/getNotesList");
		int code =  resp.getStatusCode();
		System.out.println("Status code is"+code);
		//Assert.assertEquals(code,200);
		RequestSpecification request = RestAssured.given();
		RestAssured.given().auth().preemptive().basic("Token Set."
				,"M1ivHT3opGENvpPjGn9DB1RGNEWAcjFK2BrLAHY6cjQEgCANvemng5X4NO7lRHrb");
	}
	@Test
	public void testbody() {
		Response resp =RestAssured.get("http://192.168.0.4:8000/api/notes/getNotesList");
		String data = resp.asString();
		System.out.println("Data is"+data);
		System.out.println("Response time"+resp.getTime());
	}
}

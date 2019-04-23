package FundooNotes;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
//import java.util.HashMap;
//import java.util.Map;
//import org.testng.annotations.BeforeTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//import static io.restassured.RestAssured.*;
public class Login_PostData {
	@Test
		public void postdata(){
		//RestAssured.baseURI ="http://34.210.101.131:8081/testtimes";
				RequestSpecification request = RestAssured.given();
				request.header("content type","application/json");
				JSONObject json = new JSONObject();
				
				//ADD or POST value into API
				
				json.put("email", "Shraddha123@gmail.com");
				json.put("password", "Shraddha@123");
				
				request.body(json.toJSONString());
				Response response = request.post("http://192.168.0.4:8000/api/user/login");
				int code =  response.getStatusCode();
				System.out.println("status code is"+code);
				System.out.println("Post successful");
		}
	
}

package getRequest;



import org.testng.annotations.Test;
import com.jayway.restassured.builder.RequestSpecBuilder;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Topics_PostData {
@Test
	public void postExample() {
		//Initializing Rest API's URL
		String APIUrl = "http://34.210.101.131:8081/topics";
		String APIBody="{\"topicComplexity\":\"5\",\"topicName\":\"MCQ\"}";
		// Building request using requestSpecBuilder
		RequestSpecBuilder builder = new RequestSpecBuilder();
		 
		builder.setBody(APIBody);
		builder.setContentType("application/json");
		//RequestSpecification requestSpec = (RequestSpecification) builder.build();
		RequestSpecification request = RestAssured.given();
		RestAssured.given().auth().preemptive().basic("testingtestdatablz@gmail.com","testdata@123");
		//com.jayway.restassured.specification.RequestSpecification requestSpec = builder.build();	 
		 
	
				
		Response response = request.post("http://34.210.101.131:8081/topics");
		float code =  response.getStatusCode();
		System.out.println("status code is"+code);
		String data =response.asString();
		System.out.println("Data is"+data);
		

		
		
	}
}

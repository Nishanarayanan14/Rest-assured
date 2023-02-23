package rest_assured;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.net.http.HttpResponse;

public class class3 {
	public String url = "https://trello.com";
	
  @Test
  public void Get_Boards() {
	// This code sample uses the  'Unirest' library:
	// http://unirest.io/java.html
	String str="b/YwsXPz38"; 
   Response response = given().queryParam("keys","18c636f1b08443c750a38e43c5447b64")
		   .queryParam("token","ATTA89fad61532b890cc8968045723999150240ddfc755adc32196ea0f5fae7d268968DDA51D")
		   .header("Content-Type","application/json").when()
		   .get("https://trello.com"+str).then().extract().response();
   
	  
	  

	System.out.println(response.getBody());
  }
}

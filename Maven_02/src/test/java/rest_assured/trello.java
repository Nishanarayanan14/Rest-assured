package rest_assured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import  io.restassured.response.Response;

public class trello {
	public String url="https://trello.com";
	public String id;
  @Test
  public void Get_Boards() {
	// This code sample uses the  'Unirest' library:
	// http://unirest.io/java.html
	 
	Response response =given().queryParam("key","18c636f1b08443c750a38e43c5447b64")
	  .queryParam("token", "ATTA89fad61532b890cc8968045723999150240ddfc755adc32196ea0f5fae7d268968DDA51D")
	  .header("Content-Type", "application/json").when()
	  .get("https://trello.com/b/bSa4mKFN/pooja").then().extract().response();
	 System.out.println(response.getBody());
  }
  @Test
  public void Create_Boards() {
	// This code sample uses the  'Unirest' library:
	// http://unirest.io/java.html
	baseURI = url;
	Response response1 =given().queryParam("name","lohith").queryParam("key","18c636f1b08443c750a38e43c5447b64")
	  .queryParam("token", "ATTA89fad61532b890cc8968045723999150240ddfc755adc32196ea0f5fae7d268968DDA51D")
	  .header("Content-Type", "application/json").when()
	  .post("/1/boards/").then().extract().response();
	 System.out.println(response1.toString());
	 JsonPath jp=new JsonPath(response1.asString());
	 id=jp.get("id");
	 System.out.println(id);
	 System.out.println(response1);
  }
  @Test
  public void Create_Boards1() {
	// This code sample uses the  'Unirest' library:
	// http://unirest.io/java.html
	baseURI = url;
	Response response2 =given().queryParam("name","jasmitha").queryParam("key","18c636f1b08443c750a38e43c5447b64")
	  .queryParam("token", "ATTA89fad61532b890cc8968045723999150240ddfc755adc32196ea0f5fae7d268968DDA51D")
	  .header("Content-Type", "application/json").when()
	  .post("/1/boards/").then().extract().response();
	 System.out.println(response2.toString());
	 JsonPath jp=new JsonPath(response2.asString());
	 id=jp.get("id");
	 System.out.println(id);
	 System.out.println(response2);
	
  }
  @Test
  public void Delete_Boards() {
	// This code sample uses the  'Unirest' library:
	// http://unirest.io/java.html
	baseURI = url;
	Response response3 =given().queryParam("key","18c636f1b08443c750a38e43c5447b64")
	  .queryParam("token", "ATTA89fad61532b890cc8968045723999150240ddfc755adc32196ea0f5fae7d268968DDA51D")
	  .header("Content-Type", "application/json").when()
	  .delete("/1/boards/").then().extract().response();
  }
  @BeforeTest
  public void beforeTest() {
  }
  
  @AfterTest
  public void AfterTest() {
	  
  }
}

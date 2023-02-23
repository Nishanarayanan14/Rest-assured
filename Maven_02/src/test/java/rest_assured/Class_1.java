package rest_assured;

import org.testng.annotations.Test;



import org.json.simple.JSONObject;
import org.testng.AssertJUnit;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

@Test
public class Class_1 {
	public String url1 = "https://reqres.in/api/users?page=2";
 @Test(enabled = false)
public void testcase1() {
	Response rep = get(url1);
	int status_code = rep.getStatusCode();
	AssertJUnit.assertEquals(status_code, 201);
	System.out.println(rep.asString());
	System.out.println(rep.getBody());
  }
@Test
public void testcase2() {
	given().get(url1).then().statusCode(200).body("data.first_name",hasItems("Nisha"));
	
	
}


public void testcase3() {
	JSONObject js=new JSONObject();
	js.put("name", "Nisha");
	js.put("job","CEO");
	System.out.println(js);
}
@Test
public void testcase4() {
	JSONObject js=new JSONObject();
	js.put("name", "Nisha");
	js.put("job","Chairman");
	System.out.println(js);
	
}
@Test
public void testcase5() {
	JSONObject js=new JSONObject();
	js.put("name", "Nisha");
	js.put("job","Chairman");
	System.out.println(js);
}
}


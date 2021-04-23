package api.automation.learning;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//import io.restassured.internal.support.FileReader;

public class ReadJsonFile {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsonParser=new JSONParser();
		FileReader reader=new FileReader(System.getProperty("user.dir")+"/JSONExample.json");
		Object obj=jsonParser.parse(reader);
		JSONObject empJsonObj=(JSONObject) obj;
		String firstName=(String) empJsonObj.get("firstName");
		String lastName=(String) empJsonObj.get("lastName");
		System.out.println("FirstName:"+firstName);
		System.out.println("lastName:"+lastName);
		
		
	}

}

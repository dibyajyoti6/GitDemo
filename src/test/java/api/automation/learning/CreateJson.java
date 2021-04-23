package api.automation.learning;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJson {

	public static void main(String[] args) throws FileNotFoundException {
		JSONObject jo=new JSONObject();
		jo.put("name", "Dibyajyoti");
		jo.put("number", 30);
		JSONArray ja=new JSONArray();
		ja.add("Red");
		ja.add("Green");
		ja.add("Orange");
		jo.put("color", ja);
		jo.put("condition", true);
		HashMap map=new HashMap<>();
		map.put("Noida", "P");
		map.put("Delhi", "S");
		jo.put("Friend", map);
		 PrintWriter pw = new PrintWriter("JSONExample.json");
	        pw.write(jo.toJSONString());
	          
	        pw.flush();
	        pw.close();
	}

}

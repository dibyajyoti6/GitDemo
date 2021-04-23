package api.automation.learning;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SampleJsonWrite {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		JSONObject jo=new JSONObject();
		jo.put("FirstName", "Dibya");
		jo.put("LastName", "Das");
		jo.put("age", 25);
		Map mp=new LinkedHashMap(4);
		mp.put("FlatNo", "A-901");
		mp.put("City", "Pune");
		mp.put("Country", "Maharashtra");
		jo.put("Address", mp);
		JSONArray ja=new JSONArray();
		mp=new LinkedHashMap(2);
		mp.put("type", "home");
		mp.put("number", "8073311452");
		ja.add(mp);
		mp=new LinkedHashMap(2);
		mp.put("type", "offic");
		mp.put("number", "21102567");
		ja.add(mp);
		jo.put("PhoneNumbers", ja);
		 PrintWriter pw = new PrintWriter("JSONExample.json");
	        pw.write(jo.toJSONString());
	          
	        pw.flush();
	        pw.close();
		
	
		
	}

}

package api.automation.learning;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapInsideMap {

	public static void main(String[] args) {
		//Integer it=new Integer(null);
		Map mp1=new LinkedHashMap<>();
		mp1.put("dibya", 29);
		Map mp2=new LinkedHashMap<>();
		mp2.put("swadhin", 31);
		Map mp3=new LinkedHashMap<>();
		mp3.put("Little", 25);
		Map mp4=new LinkedHashMap<>();
		mp4.put("Sangha", 28);
		mp4.putAll(mp4);
		
		mp2.putAll(mp3);
		
		mp1.putAll(mp2);
		System.out.println(mp1);
		
		
		

	}

}

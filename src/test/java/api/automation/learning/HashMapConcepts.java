package api.automation.learning;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcepts {

	public static void main(String[] args) {
		
		HashMap<Object, Object> hm=new HashMap<>();
		hm.put("Dibyajyoti", 29);
		hm.put("Swadhin", 31);
		hm.put("Little", 25);
		for(Map.Entry entry:hm.entrySet()){
			System.out.println(entry.getKey()+"--------->"+entry.getValue());
		}

	}

}

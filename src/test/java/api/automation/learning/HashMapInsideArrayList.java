package api.automation.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapInsideArrayList {

	public static void main(String[] args) {
		
		String array[]={"swadhin","dibya"};
		String s=array[1];
		HashMap<String, Integer> map=new HashMap<>();
		map.put("Dibya", 101);
		map.put("Swadhin", 102);
		map.put("Little", 100);
		/*for(Map.Entry entry:map.entrySet()){
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}*/
		Set<Entry<String,Integer>> entry=map.entrySet();
		ArrayList<Entry<String,Integer>> li=new ArrayList<>(entry);
		System.out.println(li);
		for(Entry<String,Integer> mapEntry:li){
			System.out.println(mapEntry.getKey()+"    "+mapEntry.getValue());
		}
		ArrayList<HashMap<String,Integer>> li1=new ArrayList<HashMap<String,Integer>>();
		li1.add(map);
		for(HashMap<String,Integer> map1:li1){
		for(Entry<String,Integer> mapEntry:map1.entrySet()){
			System.out.println(mapEntry.getKey()+"    "+mapEntry.getValue());
		}
		}

	}

}

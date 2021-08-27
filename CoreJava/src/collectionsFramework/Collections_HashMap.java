package collectionsFramework;

import java.util.HashMap;
import java.util.Map;


public class Collections_HashMap {
	public static void main(String[] args) {
		HashMap<String,Integer> myMap = new HashMap<>();
		
		myMap.put("Nirmalya", 22);
		myMap.put("Sampriti", 21);
		myMap.put("Momai", 18);
		myMap.put("Tubu", 28);
		myMap.put("Mutu", 58);
		
		System.out.println(myMap);
		
		// myMap.put("Nirmalya", 23);  This will override the value of the key if the key is already present
		System.out.println(myMap);
		
		if(!myMap.containsKey("Nirmalya")) {
			myMap.put("Nirmalya", 24);
		}
		System.out.println(myMap);
		
		myMap.putIfAbsent("Sampriti", 80);
		System.out.println(myMap);
		
		System.out.println(myMap.get("Tubu"));
		
		myMap.remove("Mutu");
		System.out.println(myMap);
		
		System.out.println(myMap.isEmpty());
		System.out.println(myMap.size());
		
		//Traverse
		for(Map.Entry<String, Integer> e : myMap.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
	}
}

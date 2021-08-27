package collectionsFramework;

import java.util.LinkedHashMap;

public class Collections_LinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
		
		lmap.put("Nirmalya", 22);
		lmap.put("Sampriti", 21);
		lmap.put("Momai", 18);
		lmap.put("Tubu", 28);
		lmap.put("Mutu", 58);
		
		System.out.println(lmap);
	}
}

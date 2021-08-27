package collectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

public class Collections_Hashset {
	public static void main(String[] args) {
		HashSet<Integer> mySet = new HashSet<>();
		
		// Add
		mySet.add(10);
		mySet.add(5);
		mySet.add(70);
		mySet.add(50);
		mySet.add(15);
		
		System.out.println(mySet);
		
		mySet.add(70);
		mySet.add(70);
		mySet.add(70);
		mySet.add(70);
		mySet.add(70);
		
		System.out.println(mySet.contains(50));
		
		System.out.println(mySet.isEmpty());
		
		mySet.remove(50);
		
		System.out.println(mySet);
		
		System.out.println(mySet.size());
		
		for(Integer i : mySet) {
			System.out.println(i);
		}
		
		Iterator<Integer> it = mySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		mySet.clear();
		System.out.println(mySet);
	}
}

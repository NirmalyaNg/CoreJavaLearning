package collectionsFramework;

import java.util.LinkedHashSet;

public class Collections_LinkedHashSet {
	public static void main(String[] args) {
		// In LikedHashSet order of insertion is maintained
		// LinkedHashSet is ordered but not indexed
		LinkedHashSet<Integer> lset = new LinkedHashSet<>();
		
		lset.add(10);
		lset.add(20);
		lset.add(5);
		lset.add(30);
		lset.add(2);
		
		
		
		System.out.println(lset);
	}
}

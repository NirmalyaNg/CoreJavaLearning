package collectionsFramework;

import java.util.Comparator;
import java.util.TreeSet;

public class Collections_TreeSet {
	public static void main(String[] args) {
		// In treeset elements are stored in sorted order (ascending)
		TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
		
		treeSet.add(10);
		treeSet.add(5);
		treeSet.add(70);
		treeSet.add(1);
		treeSet.add(110);
		treeSet.add(74);
		treeSet.add(74);
		
		System.out.println(treeSet);
	}
}

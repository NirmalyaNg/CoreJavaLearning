package collectionsFramework;
import java.util.ArrayList;
import java.util.Iterator;

public class Collections_ArrayList_01 {
	public static void main(String[] args) {
		
		// Creating an object of ArrayList class
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list2.add(100);
		list2.add(200);
		list2.add(300);
		
		// Insert Elements
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		list1.add(0, 5);
		list1.add(6,60);
		System.out.println(list1);
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println(list1);
		
		// Remove elements
		list1.remove(0);
		System.out.println(list1);
		
		list1.remove(Integer.valueOf(200));
		System.out.println(list1);
		
		list2.clear();
		System.out.println(list2);
		
		// Update
		
		list1.set(4,500);
		System.out.println(list1);
		
		// Check if element is present in list
		System.out.println(list1.contains(600));
		
		// Get index of first occurrence of element
		System.out.println(list1.indexOf(40));
		
		// Get the size of elements
		System.out.println("The number of elements in list1 is : " + list1.size());
		
		// Check if list is empty
		System.out.println(list2.isEmpty());
		
		System.out.println("For Loop");
		// Traversing an ArrayList --> Using for loop
		for(int i = 0;i < list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("For Each loop");
		// Traversing an ArrayList --> Enhanced for loop / Foreach loop
		for(Integer element:list1) {
			System.out.println(element);
		}
		
		// Traversing an ArrayList using Iterator
		System.out.println("Iterator");
		Iterator<Integer> it = list1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
}

package collectionsFramework;
import java.util.ArrayList;
import java.util.Iterator;

public class Collections_ArrayList_01 {
	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<>();
		ArrayList<Integer> myList2 = new ArrayList<>();
		
		myList2.add(100);
		myList2.add(200);
		myList2.add(300);
		
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(40);
		
		myList.add(0, 5);
		myList.add(5,50);
		
		myList.addAll(myList2);
		System.out.println(myList);
		
		myList.remove(5);
		System.out.println(myList);
		
		myList.remove(Integer.valueOf(300));
		System.out.println(myList);
		
		System.out.println(myList.contains(1000));
		
		System.out.println(myList.indexOf(400)); // If not present returns -1
		System.out.println(myList.indexOf(40));
		
		myList2.clear();
		System.out.println(myList2);
		
		// Convert arrayList to an array
		
		Integer[] arr = new Integer[myList.size()];
		for(int i = 0;i < myList.size();i++) {
			arr[i] = myList.get(i);
		}
		
		// Printing an arrayList
		
		System.out.println("Using for loop");
		for(int i = 0;i < myList.size();i++) {
			System.out.println(myList.get(i));
		}
		
		System.out.println("Using forEach loop");
		for(Integer i:myList) {
			System.out.println(i);
		}
		
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

package collectionsFramework;
import java.util.Iterator;
import java.util.LinkedList;

public class Collections_LinkedList_02 {
	public static void main(String[] args) {
		LinkedList<Integer> llist = new LinkedList<>();
		LinkedList<Integer> llist2 = new LinkedList<>();
		
		llist2.add(100);
		llist2.add(200);
		llist2.add(300);
		
		llist.add(10);
		llist.add(20);
		llist.add(30);
		llist.add(40);
		
		llist.add(0, 5);
		llist.add(5,50);
		
		
		System.out.println(llist);
		
		llist.addFirst(2);
		System.out.println(llist);
		
		llist.addLast(60);
		System.out.println(llist);
		
		llist.remove(Integer.valueOf(20));
		System.out.println(llist);
		
		llist.removeFirst();
		System.out.println(llist);
		
		llist.removeLast();
		System.out.println(llist);
		
		llist.remove(2);
		System.out.println(llist);
		
		System.out.println(llist.contains(40));
		
		llist.addAll(llist2);
		System.out.println(llist);
		
		System.out.println(llist.get(4));
		
		System.out.println(llist.getFirst());
		System.out.println(llist.getLast());
		
		for(int i = 0;i < llist.size();i++) {
			System.out.println(llist.get(i));
		}
		
		for(Integer i:llist) {
			System.out.println(i);
		}
		
		Iterator<Integer> it = llist.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// In arraylist insertion and deletion takes O(n) time and is costly
		// In linkedlist insertion and deletion is fast and easy since it takes O(1)
		// In arrayList retrieval of elements is fast using index O(1)
		// In linkedlist retrieval of elements is sequential so takes O(n)
	}
}

package collectionsFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Collections_Priority_Queue_05 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pqueue = new PriorityQueue<>(Comparator.reverseOrder());
		
		pqueue.offer(10);
		pqueue.offer(20);
		pqueue.offer(5);
		pqueue.offer(40);
		pqueue.offer(17);
		
		System.out.println(pqueue);
		
		System.out.println(pqueue.poll());
		
	}
}

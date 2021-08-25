package collectionsFramework;

import java.util.ArrayDeque;

public class Collections_ArrayDeque_06 {
	public static void main(String[] args) {
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		
		deque.offer(10);
		deque.offer(20);
		
		deque.offerFirst(5);
		deque.offerLast(30);
		
		System.out.println(deque);
		
		System.out.println(deque.poll());
		System.out.println(deque.pollLast());
		
		System.out.println(deque);
		
		deque.offerLast(30);
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		
	}
}

package collectionsFramework;
import java.util.ArrayDeque;
import java.util.Queue;

public class Collections_Queue_04 {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.peek());
		System.out.println(queue);
	}
}

package collectionsFramework;
import java.util.Iterator;
import java.util.Stack;

public class Collections_Stack_03 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.empty());
		
		Iterator<Integer> it = stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Integer i:stack) {
			System.out.println(i);
		}
	}
}

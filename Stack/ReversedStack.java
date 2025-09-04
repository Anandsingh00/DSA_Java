package Stack;
import java.util.Stack;
public class ReversedStack {
public static void main(String[]args) {
	Stack <Integer> original_stack = new Stack<>();
	original_stack.push(1);
	original_stack.push(2);
	original_stack.push(3);
	original_stack.push(4);
	
	Stack<Integer> reversed_stack = new Stack<>();
	
	while(!original_stack.isEmpty()) {
		
		//int element = original_stack.pop();
		// reversed_stack = element
		reversed_stack.push(original_stack.pop());
	}
	
	System.out.println(reversed_stack);
}
}

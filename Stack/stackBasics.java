package Stack;
import java.util.Stack;
public class stackBasics {
	public static void main(String[] args) {
	Stack<Integer> st= new Stack<>();
	
		
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		
		//for displaying the elements of the stack
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
		
	}
}

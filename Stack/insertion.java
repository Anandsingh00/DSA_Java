package Stack;

import java.util.Stack;

public class insertion {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st);
		// insertion at the bottom of the stack
		int position = 1;
		int val = 50;
		Stack<Integer> temp = new Stack<>();
		while (st.size() >= position) {
			temp.push(st.pop());
		}
		st.push(val);
		
		while(temp.size()>0) {
			st.push(temp.pop());
		}
		System.out.println(st);
	}
}

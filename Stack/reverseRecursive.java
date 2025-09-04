package Stack;

import java.util.Stack;

public class reverseRecursive {
	public static void displayReverse(Stack <Integer>s) {
		
		if(s.isEmpty())return;
		int top =s.pop();
		System.out.println(top);
		displayReverse(s);
		s.push(top);
			
	}
	public static void main(String[]args) {
		Stack <Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		displayReverse(st);
	}
}

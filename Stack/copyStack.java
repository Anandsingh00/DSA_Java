package Stack;
import java.util.Stack;
public class copyStack {
	public static void main(String[]args) {
		Stack<Integer> st_original= new Stack<>();
		st_original.push(10);
		st_original.push(20);
		st_original.push(30);
		st_original.push(40);
		st_original.push(50);
		st_original.push(60);
		
		System.out.println("Original Stack: "+st_original);
		
		Stack<Integer> st_temp = new Stack<>();
		
		while(!st_original.isEmpty()) {
			st_temp.push(st_original.pop());
		}
//		System.out.println("Temporary Stack: "+st_temp);
		Stack <Integer>st_final = new Stack<>();
		
		while(!st_temp.isEmpty()) {
			st_final.push(st_temp.pop());
		}
		System.out.println("Final Stack: "+st_final);
	}
}

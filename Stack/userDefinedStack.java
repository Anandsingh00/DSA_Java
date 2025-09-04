package Stack;
import java.util.Scanner;
import java.util.Stack;
public class userDefinedStack {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the length of the stack: ");
		int size = sc.nextInt();
		System.out.print("Enter elements to the stack: ");
		int count =1;
		Stack <Integer> st = new Stack<>();
		while(count<=size) {
			if(count==size)System.out.println("Stack full");
			int val = sc.nextInt();
			st.push(val);
			count++;
			
		}
		System.out.println("Your stack: "+st);
		
	}
}

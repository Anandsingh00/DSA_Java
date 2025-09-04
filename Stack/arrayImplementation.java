package Stack;

public class arrayImplementation {

	
	public static class Stack{
		private int arr [] = new int[5];
		private int idx =0;
		
		 void push(int val) {
			if(isFull()) {
				System.out.println("Stack is full");
				return;
			}
			arr[idx] = val;
			idx++;
		}
		 int pop() {
			 if(isEmpty()) {
				 System.out.println("Stack is empty");
				 return -1;
			 }
			 int top =arr[idx-1];
			 arr[idx-1]  = 0;
			 idx--;
			 return top;
		 }
		 int peek() {
			 if(isEmpty()) {
				 System.out.println("the stack is empty");
				 return -1;
			 }
			 return arr[idx-1];
		 }
		 void display() {
			 for(int i =0;i<=idx-1;i++) {
				 System.out.print(arr[i]+" ");
			 }
			 System.out.println();
		 }
		 int size() {
			 return idx;
		 }
		 boolean isEmpty() {
			 if(idx==0)return true;
			 else return false;
		 }
		 boolean isFull() {
			 if(arr.length==idx)return true;
			 else return false;
		 }
	}
	public static void main(String[]args) {
		Stack st = new Stack();
		System.out.println(st.isEmpty());
		st.push(1);
		st.push(2);
		st.push(7);
		System.out.println(st.isFull());
		st.push(1);
		st.push(2);
		System.out.println(st.isFull());
	}
}

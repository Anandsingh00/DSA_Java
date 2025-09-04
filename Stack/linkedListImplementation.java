package Stack;

public class linkedListImplementation {

	public static class Node {
		int val;
		Node next;

		// constructor
		Node(int val) {
			this.val = val;
			this.next = null;
		}
	}

	public static class Stack {
		Node top = null;
		int size = 0;

		void push(int val) {
			Node temp = new Node(val);
			temp.next = top;
			top = temp;
			size++;
		}

		int size() {
			return size;
		}

		int pop() {
			if (top == null) {
				System.out.println("Stack is empty");
				return -1;
			}
			int val = top.val;
			top = top.next;
			size--;
			return val;
		}

		int peek() {
			if (top == null) {
				System.out.println("Stack is empty");
				return -1;
			}
			int val = top.val;
			return val;
		}

		boolean isEmpty() {
			if (top == null) {
				return true;
			} else {
				return false;
			}
		}

		void display() {
			displayRec(top);
			System.out.println(); // Print a newline after displaying the stack
		}

		void displayRec(Node h) {
			if (h == null) {
				return; // End of recursion
			}
			// Recursive call first to print from bottom to top
			displayRec(h.next);
			System.out.print(h.val + " ");
		}
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(100);
		s.push(87);
		s.push(837);
		s.push(34);
		s.display();
		System.out.println(s.pop());
		s.display();
		System.out.println(s.size());

	}

}

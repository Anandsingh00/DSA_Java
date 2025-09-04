package LinkedList;

class Node {
	int val;
	Node next;

	Node(int val) {
		this.val = val;
	}

}


public class ListNodeClass {
	
	public static void display(Node root) {
		Node temp = root ;
		while(temp!=null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.print("NULL");
		
	}
	
	public static void displayrecursive(Node head) {
		//recursively	
			if(head==null)return ;
			displayrecursive(head.next);
			System.out.print(head.val+" ");
			
	}
	
	public static Node deleteHead(Node root) {
		if(root == null) {
			System.out.println("LL is empty");
			return  null;
		}
		else {
			root = root.next ;
			return root;
		}
		
	}
	public static void main(String[] args) {
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		Node f = new Node(80);
		
		a.next = b;//10->20
		b.next = c;//10->20->30
		c.next = d;//10->20->30->40
		d.next = e;//10->20->30->40->50
		e.next = f;
		
		//displayrecursive(a);
		display(a);
		
		System.out.println();
		
		deleteHead(a);
		System.out.println();
		display(a);
//		System.out.println(a.val);
//		System.out.println(a.next.next.val);
//		System.out.println(a.next.next.next.val);
//		System.out.println(a.next.next.next.val);
//		System.out.println(a.next.next.next.next.val);
	}

}

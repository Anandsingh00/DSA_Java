package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class iterativeTraversals {
	

	public static void main(String[]args) {
		
		Node a = new Node(1);
		Node b = new Node(2);
		Node d = new Node(4);
		Node e = new Node(5);
		Node c = new Node(3);
		Node f = new Node(6);
		Node g = new Node(7);
		Node h = new Node(8);
		Node i = new Node(9);
		
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.left = f ; c.right = g;
		e.left = h ; f.right = i;
		
		preorder(a);
		System.out.println();
		postOrder(a);
	}
//	private static void preorder1(Node root) {
//		Stack<Node> st = new Stack<>();
//		if(root!=null) st.push(root);
//		
//		while(st.size()>0) {
//			Node top = st.pop();
//			System.out.println();
//		}
//	}
	
	private static void preorder(Node root) {
		Stack<Node> st = new Stack<>();
		if(root!=null)st.push(root);
		
		while(st.size()>0) {
			Node top = st.pop();
			System.out.print(top.val +" ");
		
			if(top.right!=null)st.push(top.right);
			if(top.left!=null) st.push(top.left);
		}
	}
	
	private static void postOrder(Node root) {
		Stack<Node> st = new Stack<>();
		List<Integer> ans = new ArrayList<>();
		if(root!=null) st.push(root);
		while(st.size()>0) {
			Node top = st.pop();
			 ans.add(top.val);
			 if(top.left != null) st.push(top.left);
			 if(top.right!=null) st.push(top.right);
		}
		Collections.reverse(ans);
		
		for(int ele : ans) {
			System.out.print(ele +" ");
		}
	}
	
	
	
	
	
	
}

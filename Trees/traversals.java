package Trees;

import java.util.LinkedList;


import java.util.Queue;
import java.util.Scanner;

public class traversals {
//	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		Node h = new Node(8);
		Node i = new Node(9);
		
		 	

		a.left = b; a.right = c;
		b.left = d; b.right = e; 
		c.left = f;	c.right = g;
		e.left = h ; f.right = i; 
		
		System.out.print("PreOrder: ");
		preorder(a);
		System.out.println();
		System.out.print("InOrder: ");
		inorder(a);
		System.out.println();
		
		System.out.print("PostOrder: ");
		postorder(a);
		System.out.println();
		 System.out.print("\nLevel Order: ");
		 levelOrder(a);
		
		 System.out.println("\nLevel order traversal: ");
		for(int x = 0;x<=3;x++) {
//			n =x;
			nthLevel(a,0,x);
			System.out.println();
		}
		 
	//		 System.out.print("\nEnter n: ");
	//		  n = sc.nextInt();
	}

	private static void nthLevel(Node root ,int level,int lvl) {
		if(root==null) return;
		if(level==lvl)System.out.print(root.val+ " ");
		nthLevel(root.left ,level+1 , lvl);
		nthLevel(root.right, level+1 , lvl);
	
	}
	private static void preorder(Node root) {
		if (root == null)
			return;	
		//In PreOrder traversal => || root.value -> left -> right ||
		System.out.print(root.val +" ");
		preorder(root.left);
		preorder(root.right);
	}

	private static void inorder(Node root) {
		if (root == null)
			return;
		// In InOrder traversal => || left -> root.value -> right || 
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}
	private static void postorder(Node root){
		if(root ==null)return ;
		
		//In PostOrder Traversal => ||left -> right -> root.value
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.val+" ");
	}
	
	
	private static void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<>();
		if(root!=null)q.add(root);
		while(q.size()> 0) {
			Node front = q.remove();
			System.out.print(front.val+" ");
			if(front.left!=null)q.add(front.left);
			if(front.right!=null)q.add(front.right);
			
		}
	}
	}
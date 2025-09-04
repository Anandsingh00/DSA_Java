package Trees;

import java.util.ArrayList;
import java.util.List;

public class predecessorAndSuccessor {

	public static void inorder(Node root,List<Integer> arr ) {
		if(root==null)return ;
		
		inorder(root.left,arr);
		arr.add(root.val);
		inorder(root.right,arr);		
	} 
		
	public static void main(String[] args) {
		Node a = new Node(50);
		Node b = new Node(30);
		Node c = new Node(70);
		Node d = new Node(20);
		Node e = new Node(40);
		Node f = new Node(60);
		Node g = new Node(80);
		
		int key = 60;
		
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.left = f; c.right = g;
		List<Integer> arr = new ArrayList<>();
		inorder(a,arr);
//		System.out.print("Inorder: ");
//		for(int ele : arr) {
//			System.out.print(ele+" ");
//		}
		
		int pre = 0;
		int sus = 0;
		
		for(int i = 1; i<arr.size();i++) {
			if(arr.get(i)==key) {
				pre = arr.get(i-1);
				sus = arr.get(i+1);
				break;
			}
		}
		
		System.out.print("Predessor: " + pre);
		System.out.print("\tKey: " + key +"\t");
		System.out.print("Successor: " + sus);
	}

}

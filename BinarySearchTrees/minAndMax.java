package BinarySearchTrees;

class Node{
	int val;
	Node left;
	Node right;
	
	Node(int val){
		this.val = val;
	}
}
public class minAndMax {
	
	public static int max(Node root) {
		if(root.right == null) return root.val;
		
		return max(root.right);
	}
	
	public static int min(Node root) {
		if(root.left == null) {
			return root.val;
		}
		
		return min(root.left);
	}
	
	public static boolean search(Node root ,int search) {
		if(root==null) return false;
		if(root.val == search) return true;
		if(root.val < search)return  search(root.right,search);
		if(root.val > search) return search(root.left , search);
		return false;
	}
	public static void main(String[] args) {
		Node a = new Node(10);
		Node b = new Node(5);
		Node c = new Node(15);
		Node d = new Node(2);
		Node e = new Node(8);
		Node f = new Node(12);
		Node g = new Node(19);
		
		a.left = b ; a.right = c ;
		b.left = d ; b.right = e ;
		c.left = f ; c.right = g ;
		
		System.out.println(max(a));
		
		System.out.println(min(a));
		System.out.println(search(a,15));
	}
}

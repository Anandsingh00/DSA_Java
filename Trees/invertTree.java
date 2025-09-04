package Trees;

public class invertTree {
	public static void main(String []args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		
		a.left =b ;a.right = c;
		b.left = d; b.right = e;
		c.left = f ; c.right = g;
		
		System.out.print("previously Tree: ");
		print(a);
		invert(a);
		System.out.print("\nInverted Tree: ");
		print(a);
		
	}
	
	private static void print(Node root) {
		if(root==null)return ;
		System.out.print(root.val+" ");
		print(root.left);
		print(root.right);
	}
	
	private static Node invert(Node root) {
		
		if(root==null)return null;

		Node temp  = root.left ;
		root.left = root.right;
		root.right = temp;
		
		invert(root.left);
		invert(root.right);

		return root;
	}

}

package Trees;

class Node {
	int val;
	Node left;
	Node right;

	// constructor
	Node(int val) {
		this.val = val;
	}
}

public class NodeOfTree {

	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(41);
		Node c = new Node(3);
		Node d = new Node(2);
		Node e = new Node(0);
		Node f = new Node(5);
		Node g = new Node(10);
		Node h = new Node(20);

		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = g;
		c.right = f;
		e.right = h;

		System.out.println(sum(a));
		System.out.println(Multiply(a));
		System.out.println(Max(a));
		
		System.out.println(Min(a));
		
		System.out.println(size(a));
		System.out.println(level(a));
		System.out.println(height(a));
	}

	private static void display(Node root) {

		if (root == null)
			return;

		System.out.print(root.val + " ");
		display(root.left); // left subtree
		display(root.right); // right subtree
	}

	private static int sum(Node root) {
		if (root == null)return 0;
		int leftSum = sum(root.left), rightSum = sum(root.right);
		return root.val + leftSum + rightSum ;

	}

	private static int Multiply(Node root) {
		if (root == null) return 1;
		int leftMul =Multiply(root.left) , rightMul =  Multiply(root.right);
		
		int mul = (root.val == 0 ? 1 : root.val) * leftMul *  rightMul;
		return mul;
	}

	private static int Max(Node root) {
		if (root == null)
			return Integer.MIN_VALUE;
		int a = root.val, b = Max(root.right), c = Max(root.left);
		return Math.max(a, Math.max(b, c));
	}

	private static int Min(Node root) {
		if(root==null)return Integer.MAX_VALUE;
		int a =root.val,b=Min(root.left),c = Min(root.right);
		
		return Math.min(a, Math.min(b, c));
	}
	
	
	private static int size(Node root) {
		if(root ==null)return 0;
		return 1+ size(root.left)+size(root.right);
	}

	private static int level(Node root) {
		if(root==null)return 0;
		return 1+ Math.max (level(root.left) , level(root.right));
	}
	private static int height(Node root) {
		return level(root) -1;
	}
}

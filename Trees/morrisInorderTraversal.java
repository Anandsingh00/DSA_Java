package Trees;

public class morrisInorderTraversal {
	public static void main(String[] args) {
		
		// C r e a t i n g     N o d e s 
		Node a = new Node(50);
		Node b = new Node(30);
		Node c = new Node(70);
		Node d = new Node(20);
		Node e = new Node(40);
		Node f = new Node(60);	
		Node g = new Node(80);
		
		//L i n k i n g	
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.left = f; c.right = g;
		Node root = a;
		// M o r r i s    T r a v e r s a l   A l g o r i t h m
		Node curr = root;
		
		while(curr!=null) {
			if(curr.left!=null) {
				Node pred = curr.left ; // p r e d == p r e d e c e s s o r
				while(pred.right!=null && pred.right!=curr) pred = pred.right;
				if(pred.right==null) {
					// linking
					pred.right = curr;
					curr = curr.left;
				}
				else {
			// U n l i n k i n g
					System.out.print(curr.val +" ");
					curr = curr.right;
					pred.right = null;
				}
			}
			else {
				System.out.print(curr.val +" ");
				curr = curr.right;
			}
		}

	}
}

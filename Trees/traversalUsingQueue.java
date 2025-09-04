package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class traversalUsingQueue {
	// can be accessed inside the class
	public static class Pair {
		Node node;
		int level;

		Pair(Node node, int level) {
			this.node = node;
			this.level = level;
		}
	}

	private static void levelOrder(Node root) {
		int prevLevel = 0;
		Queue<Pair> q = new LinkedList<>();
		Pair p = new Pair(root, 0);
		if (root != null)
			q.add(p);
		while (q.size() > 0) {
			Pair front = q.remove();
			Node temp = front.node; // temp===>Temporary Node
			int level = front.level;
			if (level != prevLevel) {
				System.out.println();
				prevLevel++;
			}

			System.out.print(front.node.val + " ");

			if (front.node.left != null)
				q.add(new Pair(temp.left, level + 1));
			if (front.node.right != null)
				q.add(new Pair(temp.right, level + 1));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		Node h = new Node(8);
		Node i = new Node(9);

		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;
		e.left = h;
		f.right = i;
		System.out.println("Level Order: ");
		levelOrder(a);

	}

}

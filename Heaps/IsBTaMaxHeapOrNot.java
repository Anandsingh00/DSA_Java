package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

class Node {
	int val;
	Node left;
	Node right;

	// constructor
	Node(int val) {
		this.val = val;
	}
}

public class IsBTaMaxHeapOrNot {
	public static boolean isMaxHeap(Node root) {
		int n = size(root);
		return isHeap(root) && isCBT(root, 0, n);
	}

	public static int size(Node root) {
		if (root == null)
			return 0;
		return 1 + size(root.left) + size(root.right);
	}

	public static boolean isHeap(Node root) {
		if (root == null)
			return true;
//		if (root.val < root.left.val && root.left!=null || root.val < root.right.val)
//			return false;

		if (root.left != null) {
			if (root.val < root.left.val) {
				return false;
			}
		}

		if (root.right != null) {
			if (root.val < root.right.val) {
				return false;
			}
		}
		return isHeap(root.left) && isHeap(root.right);

	}

	public static boolean isCBT(Node root, int i, Integer n) {
		if (root == null)
			return true;
		if (i >= n)
			return false;
		return isCBT(root.left, 2 * i + 1, n) && isCBT(root.right, 2 * i + 2, n);

	}

	public static void main(String[] args) {
		Node a = new Node(10);
		Node b = new Node(8);
		Node c = new Node(7);
		Node d = new Node(6);
		Node e = new Node(4);

		a.left = b;
		a.right = c;
		b.left = d;
		c.right = e;
		System.out.println(isMaxHeap(a));

	}
}

class MedianFinder {
	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // maxHeap
	PriorityQueue<Integer> rs = new PriorityQueue<>();

	public MedianFinder() {

	}

	public void addNum(int num) {
		pq.add(num);
	}

	public double findMedian() {
//		Collections.sort(arr); //do  not use built-in sort 
		
		// if the heap is odd in size
		if (pq.size() % 2 != 0) {
			while(pq.size()-1!=rs.size()) {
				rs.add(pq.remove());
			}
			double median = pq.remove();
			return median;
		}
		else {
			while(pq.size()!=rs.size()) {
				rs.add(pq.remove());
			}
			double x = pq.remove();
			double y = pq.remove();
			return (x+y)/2;
		}

	}
}

package Heaps;

import java.util.PriorityQueue;

public class KthMaximumElement {
	public static void main(String[]args) {
		int arr[] = { 10, 2, 3, 8, -4, -2, 6 };
		
		PriorityQueue<Integer> p = new PriorityQueue<>();
		
		int k = 4;
		// restrict the size of heap to 2
		
		for(int ele : arr) {
			p.add(ele);
			if(p.size()>k) p.remove();
		}
		
		System.out.println(p.peek());
	}
}

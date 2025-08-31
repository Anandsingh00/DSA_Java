package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthMinElement {

	public static void main(String[] args) {
		int arr[] = { 10, 2, 3, 8, -4, -2, 6 };

		// Using minheap TC->O(nlogn) && SC->O(logn)
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		int k = 4; // Output-> 2
//
//		for (int i = 0; i < arr.length; i++) {
//			pq.add(arr[i]);
//		}
//		System.out.println(pq);
//
//		int ele = 0;
//
//		for (int i = 1 ; i <= k; i++) {
//			
//			ele = pq.remove();
//			if(i==k)break;
//		}
//		System.out.println(ele);

		// Using maxHeap
		PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
		int k = 3;
		for (int ele : arr) {
			p.add(ele);
			if (p.size() > k)
				p.remove();
		}
		int ele = p.peek();
		System.out.println(ele);
	}
}

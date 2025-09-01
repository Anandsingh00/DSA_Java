package PriorityQueues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class kSortedArray2 {
	public static void main(String[] args) {

		int arr[] = { 10, 9, 8, 7, 4, 70, 60, 50 };
		int k = 5;

		// use a maxHeap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		List<Integer> ans = new ArrayList<>();

		for (int ele : arr) {
			pq.add(ele);
			if (pq.size() > k) {
				ans.add(pq.remove());
			}
		}
		
		while(!pq.isEmpty()) {
			ans.add(pq.remove());
		}
		
		for(int ele: ans) {
			System.out.print(ele + " ");
		}
	}
}

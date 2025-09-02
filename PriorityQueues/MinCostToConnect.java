package PriorityQueues;

import java.util.PriorityQueue;

public class MinCostToConnect {
	public static void main(String[] args) {
		int arr[] = { 2, 7, 4, 1, 8 };
		int cost = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(); // create a min heap

		for (int ele : arr) {
			pq.add(ele);
		}

		while (pq.size() > 1) {
			int sum = pq.remove() + pq.remove();
			cost += sum;
			pq.add(sum);
		}
		System.out.println(cost);

	}
}

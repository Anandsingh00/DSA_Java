package PriorityQueues;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStone {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 1, 8, 1 };
		int result = lastStoneWeight(arr);
		System.out.println(result);
	}

	public static  int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int e : stones) {
			pq.add(e);
		}

		while (pq.size() >= 0) {
			if(pq.size()==1)break;
			int x = pq.remove();
			int y = pq.remove();
			int res = x - y;
			if (res > 0)
				pq.add(res);
		}

		return pq.remove();

	}
}

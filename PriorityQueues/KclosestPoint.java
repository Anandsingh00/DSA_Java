package PriorityQueues;

import java.util.Collections;

import java.util.PriorityQueue;

public class KclosestPoint {
	public static void main(String[] args) {
		int[][] arr = { { 3, 3 }, { 5, -1 }, { -2, 4 }, { 1, 0 }, { 3, 2 } };
		int k = 2;

	}

	public class Triplet implements Comparable<Triplet> {
		int d;
		int x;
		int y;

		Triplet(int d, int x, int y) {
			this.d = d;
			this.x = x;
			this.y = y;
		}

		public int compareTo(Triplet t) {
			return this.d - t.d;
		}
	}

	public int[][] kClosest(int[][] points, int k) {
		PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < points.length; i++) {
			int x = points[i][0];
			int y = points[i][1];
			int d = x * x + y * y;
			pq.add(new Triplet(d, x, y));

			if (pq.size() > k)
				pq.remove();

		}
		int ans[][] = new int[k][2];

		for (int i = 0; i < k; i++) {
			Triplet t = pq.remove();
			ans[i][0] = t.x;
			ans[i][1] = t.y;
		}
		return ans;
	}
}

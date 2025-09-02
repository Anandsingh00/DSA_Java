package PriorityQueues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KclosestPoint {
	public static void main(String[] args) {
		int[][] arr = { { 3, 3 }, { 5, -1 }, { -2, 4 }, { 1, 0 }, { 3, 2 } };
		int k = 2;
		int[] [] ans = kClosest(arr, k);
		
		for(int i = 0 ; i<ans.length ;i++) {
			for(int j = 0 ; j<2 ; j++) {
				System.out.print(ans[i][j]+" ");
			}
		}
	}

	public static int[][] kClosest(int[][] arr, int k) {
		
		PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < arr.length; i++) {
			int x = arr[i][0];
			int y = arr[i][1];
			
			int d = x * x + y * y ;
			pq.add(new Triplet(d,x,y));
			if(pq.size() > k) {
				pq.remove();
			}				
		}
		int [] [] ans = new int [k] [2] ;
		for(int i = 0 ; i < k ; i++) {
			Triplet t = pq.remove();
			ans[i][0] = t.x;
			ans[i][1] = t.y;
		}
		return ans; 
		
	}

	static class Triplet implements Comparable<Triplet> {
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
	
	

}

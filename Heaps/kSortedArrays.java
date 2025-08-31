package Heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class kSortedArrays {
	public static void main(String[] args) {
		int arr[] = { 6, 5, 3, 2, 8, 10, 9 };
		int k = 3;
		// starting with minHeap
		PriorityQueue<Integer> p = new PriorityQueue<>();
		List<Integer>ans = new ArrayList<>();
		
		for(int ele: arr) {
			p.add(ele);
			if(p.size()>k) {
				ans.add(p.remove());
			}
		}
		while(!p.isEmpty()) {
			ans.add(p.remove());
		}
	
		
		
		for(int ele : ans) {
			System.out.print(ele+" ");
		}

	}

}

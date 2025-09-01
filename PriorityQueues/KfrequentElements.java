package PriorityQueues;

import java.util.HashMap;
import java.util.PriorityQueue;

public class KfrequentElements {
	private static class Pair implements Comparable<Pair>{
		int ele;
		int freq;
			
		Pair(int ele , int freq){
			this.ele = ele;
			this.freq = freq;
		}
		public int compareTo(Pair p ) {
			return this.freq - p.freq;
		}
	}

	public static void main(String[]args) {
		int arr [] = {1,2,1,3,1,3,3,2,3,4,5,4,2,2};
		
		int k = 3;
		int ans [] = new int [k];
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int ele : arr) {
			if(map.containsKey(ele)) {
				int freq = map.get(ele);
				map.put(ele, freq+1);
			}
			else map.put(ele,1);
		}
		PriorityQueue<Pair> pq =  new PriorityQueue<>();
		for(int ele: map.keySet()) {
			int freq = map.get(ele);
			pq.add(new Pair(ele,freq));
			if(pq.size()>k)pq.remove();
		}
		int j = 0;
		while(!pq.isEmpty()) {
			Pair p = pq.remove();
			ans[j] = p.ele;
		}
		
		for(int ele: ans) {
			System.out.print(ele  +" ");
		}
		
	}
	
}

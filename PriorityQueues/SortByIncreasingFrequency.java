package PriorityQueues;

import java.util.HashMap;
import java.util.PriorityQueue;





public class SortByIncreasingFrequency {
	private static class Pair implements Comparable<Pair>{
		int ele;
		int freq;
			
		Pair(int ele , int freq){
			this.ele = ele;
			this.freq = freq;
		}
		public int compareTo(Pair p ) {
			if(this.freq==p.freq) return p.ele - this.ele;
			return this.freq - p.freq;
		}
	}

	public static void main(String [] args) {
		int arr[] = {1,1,1,1,1,1,2,11,1,2,2,2,3,3,4,4,4,4,4,4,};
		int [] ans = frequencySort(arr);
		
		for(int ele : ans) {
			System.out.print(ele+" ");
		}
	}
	
	public static int[] frequencySort(int[] arr) {
		
		int [] ans = new int [arr.length];
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
		}
		
		int i = 0;
		while(!pq.isEmpty()) {
			Pair p = pq.remove();
			int freq = p.freq;
			
			while(freq>0) {
				ans[i] = p.ele;
				i++;
				freq--;
			}
			
		}
		return ans;
        
    }
}

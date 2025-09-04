package Heaps;

import java.util.PriorityQueue;

public class HeapSortAlgorithm {

	public static void main(String[] args) {
		int[] arr = {42, 7, 15, 3, 29, 88, 54, 11, 67, 23};
		arr = HeapSort(arr);
		
		for(int ele : arr) {
			System.out.print(ele +" ");
		}
	}
	
	
	//TC : O(nlogn) && SC : O(n) for the heap space
	public static int[] HeapSort(int [] arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int ele: arr) {
			pq.add(ele);
		}
		//all the elements are added in min heap
		//no remove and add all the elements in the array
		int i = 0;
		while(!pq.isEmpty()) {
			arr[i] = pq.remove();
			i++;
		}
		return arr;
	}

}

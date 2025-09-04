package Hashmaps;

import java.util.HashSet;

public class basicSets {
	public static void main(String[]args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(20);
		set.add(100);
		set.add(8);
		set.add(4);
		set.add(200);
		set.add(-8);
		set.add(400);
		//System.out.println(set);
		//search -True/False
		//System.out.println(set.contains(100));
		
		set.add(50);
		//System.out.println("Size is:" + set.size());
		
		set.remove(-8);
		set.add(50);
		System.out.println(set);
		Object[] arr  = set.toArray();
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

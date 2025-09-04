package Hashmaps;

import java.util.HashSet;

public class setIterate {
public static void main(String[] args) {
	// iterating set using for-each loop
	HashSet<Integer> set = new HashSet<>();
	set.add(20);
	set.add(100);
	set.add(8);
	set.add(4);
	set.add(200);
	set.add(-8);
	set.add(400);
	
	for(int ele : set) {
		System.out.print(ele+" ");
	}
	set.clear();
}
}

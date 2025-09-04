package Hashmaps;

import java.util.HashMap;
import java.util.TreeMap;

public class iterateMap {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Anand", 174);
		map.put("Atik", 164);
		map.put("Anish", 193);
		map.put("Dip", 69);
		map.put("Aditya", 123);
		
		for(String key: map.keySet()) {
			int val = map.get(key);
			System.out.println(key +" "+ val);
		}
		System.out.println();
		
		
	// B o t h   a r e   n o t   u s e f u l 
//		for(int val : map.values()) {
//			System.out.println(val);
//		}
		
//		for(Object pair: map.entrySet()) {
//			System.out.println(pair);
//		}
	}	
}

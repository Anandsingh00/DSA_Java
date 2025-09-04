package Hashmaps;

import java.util.HashMap;

public class mapBasic {
	public static void main(String[]args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Anand",74);
		map.put("Ishika", 63);
		map.put("Dip", 163);
		map.put("Aditya", 153);
		map.put("Atik", 164);
		
		//System.out.println(map+" "+map.size());
		map.put("Anand", 82);
		map.put("Raghav", 92);
		System.out.println(map +" "+ map.size());
		map.remove("Raghav");
		System.out.println(map +" "+ map.size());
		
		

	}
}

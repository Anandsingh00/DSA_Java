package Strings;

import java.util.Arrays;

public class sortingString {
	public static void main(String[] args) {
		String s = "anand";
		char ch[] = s.toCharArray();

		for (char ele : ch) {
			System.out.print(ele);
		}
		System.out.println();
		Arrays.sort(ch);
		for (char ele : ch) {
			System.out.print(ele);
		}
System.out.println();
		
		StringBuilder sb = new StringBuilder("singh");
		 
		char [] arr =  sb.toString().toCharArray();
		Arrays.sort(arr);
		
		for(char ele:arr) {
			System.out.print(ele);
		}
	}
}

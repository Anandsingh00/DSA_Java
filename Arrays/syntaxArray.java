package Arrays;

import java.util.*;

public class syntaxArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

//		for(int ele: arr) {
//			System.out.print(ele +" ");

		ArrayList<Integer> brr = new ArrayList<>(6);
		brr.add(0, 10);
		brr.add(1, 20);
		brr.add(2, 30);
		brr.add(3, 40);
		brr.add(4, 50);
		brr.add(5, 60);
		System.out.println(brr);
		System.out.println(brr.size());
		// to update a value in the arraylist  :-
		brr.set(2,67);
		System.out.println(brr);
		
		//add element in array
		brr.add(90);
		System.out.println(brr.size());
		System.out.println(brr);
	}
}

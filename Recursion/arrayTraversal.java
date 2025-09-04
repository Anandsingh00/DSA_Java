package Recursion;

public class arrayTraversal {
	public static void print(int i ,int []arr) {
		if(i==arr.length) return;
		System.out.println(arr[i]+" ");
		print(i+1,arr);
	}
public static void main(String[]args) {
	int [] arr = {6,0,8,4,7,2,1,9};
	print(0,arr);
}
}

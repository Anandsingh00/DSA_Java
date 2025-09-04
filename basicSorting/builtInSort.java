package basicSorting;
import java.util.Arrays;
public class builtInSort {
public static void main(String[] args) {
	int arr[] = {9,-4,8,3,1};
	
	for(int ele:arr) {
		System.out.print(ele+" ");
	}
	System.out.println();
	Arrays.sort(arr);
	
	for(int ele:arr) {
		System.out.print(ele+" ");
	}
}
}

package Arrays;
import java.util.Arrays;
public class builtInMethods {
	public static void main(String [] args) {
		int arr[] = {38,26,78,55,43};
		
		//for each loop
		for(int ele : arr) {
			System.out.print(ele +" ");
		}
		System.out.println("\n");
		
		//built-in method for sorting the whole array
		Arrays.sort(arr);
		for(int i =0;i<=arr.length-1;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

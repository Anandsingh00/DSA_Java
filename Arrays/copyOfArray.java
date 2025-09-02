package Arrays;
import java.util.Arrays;
public class copyOfArray {

	public static void main(String[] args) {
		int arr[] = {38,26,78,55,43};
		System.out.print("arr: ");
		
		// for each loop
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		  
		
//		
//		int []num = arr; // shallow copy
//		num [0] = 70;
//		System.out.println("arr[0]:" +arr[0]);
		
		
		
		
		// deep copy
		int [] brr = Arrays.copyOf(arr,arr.length);
		brr[0]= 90;
		System.out.print("arr(after updating brr[0]): ");
		for(int ele : arr) {
			System.out.print(ele +" ");
		}
		System.out.println();
		System.out.print("brr: ");
		for(int ele : brr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		
		System.out.print("crr: ");
		//other way to create a deep copy
		int [] crr = 	new int [arr.length];
		for(int i = 0 ; i <= crr.length - 1 ; i++) {
			crr[i] = arr[i];
		}
		
		for(int ele : crr) {
			System.out.print(ele + " ");
		}
	}

}











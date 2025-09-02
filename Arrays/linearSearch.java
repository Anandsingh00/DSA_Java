package Arrays;
import java.util.Scanner;
public class linearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the targeted element: ");
		int x = sc.nextInt();
		
		System.out.println("Enter the size of array: ");
		int  n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the  array : ");
		
		//taking array as input
		for(int  i = 0; i <= arr.length-1 ; i++) {
			arr[i]=sc.nextInt();
		}
		
		//code for linear search
		boolean flag = false;
		
		for(int j = 0;j<=arr.length-1;j++) {
			if(x == arr[j]) {
				flag = true;
				break;
			}
		}
		
		if(flag = true) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
	}
}
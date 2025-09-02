package Arrays;
import java.util.Scanner;
public class minInArray {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int arr[] = {31,4,56,-9,8};
		
		int min=Integer.MAX_VALUE;
		
		for(int i = 0;i<=arr.length-1;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}

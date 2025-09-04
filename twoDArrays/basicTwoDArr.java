package twoDArrays;
import java.util.Scanner;
public class basicTwoDArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the No. of Rows and Columns: ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
		
		int arr [] [] = {{1,0,0},{0,1,0},{0,0,1}};
//		System.out.println(" Enter the elements in the array:");
		//for taking input in the 2-D array
		
//		for(int i =0;i<a;i++) { //loop for rows
//			for(int j = 0;j<b;j++) { // loop for columns
//				arr[i][j] = sc.nextInt();
//			}
//		}
		int m = arr.length; //for number of rows
		int n = arr[0].length;//for column
//		System.out.println("rows are: " + m + " and Columns are " + n);
		System.out.println("Your array is: ");
		//for printing the 2-D array
//		for(int i =0;i<m;i++) {
//			for(int j =0;j<n;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		//Another way to print array
		for(int []ele: arr) {
			for(int x : ele) {
				System.out.print(x	+" ");
			}
			System.out.println();
		}
		
		//for printing the number of rows and column in the given array
		
		
			}

}

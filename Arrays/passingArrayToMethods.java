package Arrays;

public class passingArrayToMethods {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		System.out.println(arr[0]);
		change(arr);
		System.out.println(arr[0]);
	}

	public static void change(int[] brr) {  //array is passed by reference while Int is passed by value	
		 brr[0]=90;
		
	}

	
}

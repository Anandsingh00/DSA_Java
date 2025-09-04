package BinarySearch;

public class bs {
	public static void main(String[] args) {
		int[] arr = { 10, 23, 46, 89, 91, 97, 107, 140, 264 };
		int n =arr.length;
		int target = 22;
		int lo =0;
		int hi =n-1;
		boolean flag = false; //item not found
		while(lo<=hi) {
			int mid =(hi -lo)/2 +lo;
			if(arr[mid] == target) {
				flag = true;
				break;
			}
			else if(arr[mid]>target) {
				hi = mid-1;
			}
			else {
				lo =mid+1;
				
			}
		}
		
		if(flag == true) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Not Found");
		}
	}
}

package BinarySearch;

public class searchInRotatedArray {

	public static void main(String[] args) {
		int [] arr= {4,5,6,7,0,1,2,3};
		int n= arr.length;
		
		int  p = 0;//pivot
		
		int lo =0,hi =n-1;
		while(lo<=hi) {
			int mid = lo +(hi-lo)/2;
			if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid+1]) {
				p = mid;
				break;
			}
			else if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]) {
				p = mid;
				break;
			}
			else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) {
				if(arr[mid]>arr[n-1]) lo =mid+1;
				else  hi =mid -1;
			}
		}
		System.out.println(p);
	}
}

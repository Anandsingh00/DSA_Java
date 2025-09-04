package BinarySearch;

public class kthClosestInteger {
public static void main(String [] args) {
	int arr[] = {1,2,3,4,7,8,9,10};
	int n =arr.length;
	int lo =0, hi =n-1;
	int lb = -1;
	int target =6;
	while(lo<=hi) {
		int mid = (hi+lo)/2;
		if(arr[mid]>=target) {
			lb = mid ;
			break;
		}
		else if(arr[mid]>target) {
			hi =mid-1;
		}
		else lo =mid+1;
	}
	System.out.println(lb);
}
}

package BinarySearch;

public class peakIndexInMoutainArray {
	public static void searchIndex(int arr[], int n) {
		int lo = 1, hi = n - 2;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			
			if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
				System.out.println(mid + " is the peak index");
				return;
			} else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}

		}
	}

	public static void main(String[] args) {
		int arr[] = { 0,1,2,3,4,5,6,7 };
		int n = arr.length;
		searchIndex(arr, n);

	}

}

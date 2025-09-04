package basicSorting;

public class selectionSort {
	public static void print(int ans[]) {
		for (int ele : ans) {
			System.out.print(ele + " ");
		}
	}

	public static void swap(int[] arr	, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 10, -4, 20, 1, -6, 8 };
		int n = arr.length;
		// selection sort
		for (int i = 0; i < n - 1; i++) {
			int min = Integer.MAX_VALUE;
			int mindx = -1; // for the index of the minimum element
			// loop for getting the minimum element in the current array and its index
			for (int j = i; j < n; j++) {
				if (arr[j] < min) {
					min = arr[j];
					mindx = j;
				}
			}
			// swapped the minimum element with the array of ith index
			swap(arr,i,mindx);
		}

		print(arr);
	}
}

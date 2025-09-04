package basicSorting;

public class insertionSort {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void print(int ans[]) {
		for (int ele : ans) {
			System.out.print(ele + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, -4, 20, 1, -6, 8 };
		int n = arr.length;
		// Insertion Sort

//	for(int i=1;i<n;i++) {
//		for(int j=i;j>=1;j--) {
//			if(arr[j]<arr[j-1])
//				swap(arr,j,j-1);
//			else break;
//		}
//		
//	}
		for (int i = 1; i < n; i++) {
			int j = i;
			while (j >= 1 && arr[j] < arr[j - 1]) {
				swap(arr, j, j - 1);
				j--;
			}
		}

		print(arr);
	}
}

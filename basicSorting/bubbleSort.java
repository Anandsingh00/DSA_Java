package basicSorting;

public class bubbleSort {
	public static void print(int[] arr) {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
	public static void swap(int []arr,int i) {
		int temp = arr[i];
		arr[i] = arr[i + 1];
		arr[i + 1] = temp;
	}
	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 2, 1 };

		print(arr);
		int n = arr.length;
		// BubbleSort-1
//		for (int x = 0; x < n - 1; x++) {
//			for (int i = 0; i < n - 1; i++) {
//				if (arr[i] > arr[i + 1]) {
//					int temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//				}
//			}
//		}
		// BubbleSort -2
		for (int x = 0; x < n - 1; x++) { //till the 2nd last element
			boolean flag = true;
			for (int i = 0; i < n - 1 - x; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr,i);
					flag = false;
				}
			}
			if (flag == true)
				break;
		}

		print(arr);
	}
}
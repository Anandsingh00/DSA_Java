package basicSorting;

public class decreasingOrderSort {
	public static void main(String[] args) {
		// Using the bubble sort algorithm
		int arr[] = { 4, 2, 3, 5, 1 };
		int n = arr.length;

		for (int x = 0; x <= n - 1; x++) {
			boolean flag = true;
			for (int i = 0; i < n - 1-x; i++) {

				if (arr[i] < arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					flag = false;
				}
			}
			if (flag == true)
				break;
		}
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
	}
}

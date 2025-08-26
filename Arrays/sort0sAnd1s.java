package Arrays;

public class sort0sAnd1s {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0 }; // sample Array
		//int zeroCount = 0;
		//int zeros = countZeros(arr, zeroCount);
		
//		sortArray(arr,zeros);
		sortArray2(arr);

		printArray(arr);
	}

	public static int countZeros(int[] arr, int count) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		return count;
	}

	//
	public static void sortArray(int[] arr, int zeroCount) {

		for (int i = 0; i < zeroCount; i++) {
			arr[i] = 0;
		}

		// zeroes are at its correct position
		for (int i = zeroCount; i < arr.length; i++) {
			arr[i] = 1;
		}
	}

	public static void sortArray2(int[] arr) {
		// using two pointer approach
		//TC :-> O(n)

		int i = 0, j = arr.length - 1;

		while (i <= j) {
			if (arr[i] == 1 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			if(arr[i] == 0) i++;
			if(arr[j] == 1) j--;

		}

	}

	public static void printArray(int arr[]) {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();

	}

}

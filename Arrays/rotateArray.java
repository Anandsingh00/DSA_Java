package Arrays;

public class rotateArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length; // 7
		int res[] = new int[n		];

		int k = 4; // 2 rotation

		int i = n - k, j = 0; // i=4 j =0
		while (j < k) {
			res[j] = arr[i];
			j++;
			i++;
		}
		int a = 0;
		int b = k;
		while (b < n) {
			res[b] = arr[a];
			a++;
			b++;
		}
		for (int ele : res) {
			System.out.print(ele + " ");
		}
	}

}

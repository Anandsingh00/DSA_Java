package twoDArrays;

import java.util.Scanner;

public class spiralPrinting2 {
	public static void print(int arr[][]) {
		for (int[] ele : arr) {
			for (int x : ele) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of 2-D array: ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		int count = 1;

		// code for spiral storing elements in the array
		int minr = 0, maxr = n - 1;
		int minc = 0, maxc = n - 1;
		// i--> row , j-->column

		while (minc <= maxc && minr <= maxr) {
			// left to right;
			for (int j = minc; j <= maxc; j++) {
				arr[minr][j] = count;
				count++;
			}
			minr++;
			if (minc > maxc || minr > maxr)
				break;
			// top to bottom
			for (int i = minr; i <= maxr; i++) {
				arr[i][maxc] = count;
				count++;
			}
			maxc--;

			if (minc > maxc || minr > maxr)
				break;
			// right to left
			for (int j = maxc; j >= minc; j--) {
				arr[maxr][j] = count;
				count++;
			}
			maxr--;
			if (minc > maxc || minr > maxr)
				break;
			// bottom to top
			for (int i = maxr; i >= minr; i--) {
				arr[i][minc] = count;
				count++;
			}
			minc++;
		}

		print(arr);
	}
}

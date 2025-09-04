package twoDArrays;

public class sprialPrint {
	public static void print(int[][] arr) {
		int m = arr.length, n = arr[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		int m = arr.length, n = arr[0].length;
		print(arr);

		int minr = 0, maxr = m - 1;
		int minc = 0, maxc = n - 1;
		// i--> row , j-->column

		while (minc <= maxc && minr <= maxr) {
			// left to right;
			for (int j = minc; j <= maxc; j++) {
				System.out.print(arr[minr][j] + " ");
			}
			System.out.print("| ");
			minr++;
			if (minc > maxc || minr > maxr)
				break;
			// top to bottom
			for (int i = minr; i <= maxr; i++) {
				System.out.print(arr[i][maxc] + " ");
			}
			System.out.print("| ");
			maxc--;

			if (minc > maxc || minr > maxr)
				break;
			// right to left
			for (int j = maxc; j >= minc; j--) {
				System.out.print(arr[maxr][j] + " ");
			}
			System.out.print("| ");
			maxr--;
			if (minc > maxc || minr > maxr)
				break;
			// bottom to top
			for (int i = maxr; i >= minr; i--) {
				System.out.print(arr[i][minc] + " ");
			}
			System.out.print("| ");
			minc++;
		}

	}

}

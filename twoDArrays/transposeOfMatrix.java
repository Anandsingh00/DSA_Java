package twoDArrays;

public class transposeOfMatrix {

	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6}};
		int m = arr[0].length;
		int n = arr.length;
		int [][] arrt = new int[m][n];
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				arrt [i][j] = arr[j][i];
			}
		}
		for(int ele[]: arrt) {
			for(int x : ele) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

}

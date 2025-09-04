 package twoDArrays;

public class additionOfTwoDArrays {

	public static void main(String[] args) {
		int [][] arr = {{1,9,2},{3,7,4},{8,5,6}};
		int [][] brr = {{9,3,7},{8,6,5},{2,4,1}};
		int ans[][] = new int[arr.length][arr[0].length];
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				ans[i][j] = arr[i][j] +  brr[i][j];
			}
		}
		
		for(int ele[]:ans) {
			for(int x : ele) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

}

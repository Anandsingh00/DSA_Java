package twoDArrays;

public class maxInTwoDArray {

	public static void main(String[] args) {
		int [][]arr= {{1,2,11},{4,5,6},{7,8,9}};
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				max = Math.max(max,arr[i][j]);
				sum += arr[i][j];
				}
		}
		
		System.out.println("The max element in array is: " + max);
		System.out.println("Sum is: "+ sum);
	}

}

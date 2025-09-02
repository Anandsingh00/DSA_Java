package Arrays;

public class twoSum {

	public static void main(String[] args) {
		int arr[] = {-1,5,7,0};
		int target = 9;
		
		//algoritm 
		for(int i = 0 ; i <= arr.length - 1 ; i++) {
			for(int j = i+ 1 ; j <= arr.length - 1 ; j++) {
				if(arr[i]+arr[j] == target) {
					System.out.println("The two numbers are " + arr[i] + " and " + arr[j]);
					break;
				}
				else {
					System.out.println("such numbers doesn't exist in the given array");
					break;
				}
			}
		}
	}

}

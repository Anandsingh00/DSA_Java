package prefixSum;

public class RunningSumOfArray {
	public static int[] runningSum(int[] nums) {
		int sumArr[] = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				sumArr[i] = nums[i];
			} else {
				sumArr[i] = nums[i] + sumArr[i - 1];
			}
		}
		return sumArr;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		int ans[] = runningSum(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}

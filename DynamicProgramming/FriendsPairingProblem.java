package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class FriendsPairingProblem {

	public static int pairs(int n, int[] dp) {
		if (n<=2)
			return n;
		if (dp[n] != -1)
			return dp[n];
		return dp[n] = pairs(n - 1, dp) + (n - 1) * pairs(n - 2, dp);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		int dp[] = new int[n + 1];
		Arrays.fill(dp, -1);
		int ans = pairs(n, dp);

		System.out.println("Output: " + ans);
	}

}

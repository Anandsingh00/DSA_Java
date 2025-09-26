package DynamicProgramming;

public class FriendsPairingProblem {
	
	public static int pairs(int n){
		if(n==0 || n==1 ||n==2)return n;
		
		return n*(pairs(n-1) + (n-1)*pairs(n-2));
	}
	public static void main(String[]args) {
		int ans = pairs(4);
		System.out.println(ans);
	}

}

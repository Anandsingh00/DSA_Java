package Arrays;

public class nextGreatestElement {

	public static void main(String[] args) {
		int [] arr = {23,47,87,21,36,55,64};
		int n = arr.length;
		int ans[] = new int[arr.length];
		
			
		//METHOD - 1 Brute Force
//		for(int  i = 0;i< arr.length;i++) {
//			int max =-1;
//			for(int j = 1+i;j<arr.length;j++) {
//				if(arr[j]>max) {
//					max = arr[j];
//				}
//			}
//			ans [i]= max;
//		}
		
		
		//METHOD-2(more optimised)
		ans[n-1]= -1;
		int nge = arr[n - 1];
		for(int i = n-2;i>=0;i--) {
			ans[i] =nge;
			nge = Math.max(nge, arr[i]);
		}
		
		for(int ele : ans) {
			System.out.print(ele+ " ");
		}

	}

}

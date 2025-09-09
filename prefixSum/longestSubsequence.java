package prefixSum;

import java.util.Arrays;

public class longestSubsequence {

	public static void main(String[]args) {
		int arr[] =  {4,5,2,1} ;
		int queries[] = {3,10,21};
		int ans[] = answerQueries(arr,queries);
		
		
		// print the array
		for(int ele : ans) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
	
	public static int[] answerQueries(int[] arr, int[] queries) {
        Arrays.sort(arr); // at first sort the array
         
         int n = arr.length , m = queries.length;
        // making a  preSum array
         for(int i = 1 ; i < n ; i++){
            arr[i] += arr[i-1];
         }
         int ans [] = new int[m];
         for(int i = 0 ; i< m ; i ++ ){
            // binary search on array
            int  lo = 0 , hi = n-1;
            while(lo<=hi){
                int mid = lo +(hi-lo)/2;
                if(arr[mid]>queries[i]) hi = mid -1;
                else{
                    ans[i] = Math.max(ans[i] , mid+1);//compare both the lengths
                    lo = mid + 1 ; 
                }
            }
         }
         return ans;
    }

}

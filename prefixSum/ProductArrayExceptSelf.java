package prefixSum;

public class ProductArrayExceptSelf {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int ans [] = productExceptSelf(arr);
		System.out.print("Answer array: ");
		for(int ele : ans ) {
			System.out.print(ele+" ");
		}
	}
		public  static int[] productExceptSelf(int[] arr) {
			int pre[] = new int[arr.length];
			int suf[] = new int[arr.length];
			int n = arr.length;
			// fill the pre array
			pre[0] = 1;
			for (int i = 1; i < n; i++) {
				pre[i] = pre[i - 1] * arr[i - 1];
			}
			System.out.print("Pre array: ");
			for(int ele : pre ) {
				System.out.print(ele+" ");
			}
			System.out.println();
			
			// fill the suf array
			
			
			suf[n - 1] = 1;
			for (int j = n - 2; j >= 0; j--) {
				suf[j] = arr[j+1] * suf[j+1];
			}
			System.out.print("Suf array: ");
			for(int ele : suf ) {
				System.out.print(ele+" ");
			}
			System.out.println();
			
			// now update the arr 
			for(int k = 0 ; k<n;k++) {
				arr[k] = suf[k] * pre[k];
			}
			return arr;
		}
		
	
}



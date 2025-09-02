package Arrays;

public class mergeTwoSortedArrays2 {

	public static void main(String[] args) {
		int arr[] = {11,33,42,71,121};
		int brr[] = {26,52,69,81,99};
		int crr[] = new int[arr.length + brr.length];
		
		int i = arr.length -1;
		int j = brr.length -1;
		int k = crr.length -1;
		
		while(i>=0 && j>=0) {
			if(arr[i]> brr[j]) {
				crr[k] = arr[i];
				i--;
			}
			else {
				crr[k] = brr[j];
				j--;
			}
			k--;
			
		}
		while(i>=0) {
			crr[k] = arr[i];
			i--;
		}
		
		while(j >= 0) {
			crr[k] = brr[j];
			j--;
		}	
		for(int ele: crr) {
			System.out.print(ele +" ");
		}
	}

}

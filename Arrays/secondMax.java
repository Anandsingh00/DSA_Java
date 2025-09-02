package Arrays;

public class secondMax {

	public static void main(String[] args) {
	int arr [] = {5,4,3,2,1};
			
	int max = Integer.MIN_VALUE;
	for(int i = 0; i <= arr.length - 1 ; i++){
//		if(max<arr[i]) {
//			max = arr[i];
//		}
		max = Math.max(max,arr[i]);
	}
	
	int smax = Integer.MIN_VALUE;
	
	for(int i = 0; i <= arr.length-1 ; i++) {
		if(arr[i] != max) {
			if(arr[i]>smax) {
				smax = arr[i];
			}
		}
	}
	
			System.out.println(smax);
	}

}

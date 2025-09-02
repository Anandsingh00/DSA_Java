package Arrays;

public class maxInArray {

	public static void main(String[] args) {
		int arr [] = {4,8,9,34,15,98};
		
		int max = Integer.MIN_VALUE;
		
		for(int i =0;i<=arr.length-1;i++) {
//			if(arr[]>max) max = arr[i]
			max = Math.max(max,arr[i]);
		}
		System.out.println(max);
	}
	}

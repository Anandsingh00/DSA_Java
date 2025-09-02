package Arrays;
public class arrays {
	
	public static void main(String[]args) {
		
	// Array initialize 
//		int arr [] = new int [5];
		
//		arr[0]= 6;
//		arr[1] = 2 ;
//		arr[2] = 4;
//		arr[3] = 10;
//		arr[4] = 17;
		
		//other way of assigning
		
		//initializing the array and assigning the value
		int arr [] = {6,2,4,10,17,67};
		
		// printing 
		for(int j = 0 ; j <= arr.length - 1 ; j++ ) {
			System.out.print(arr[j] + " ");
		}
		System.out.println(); 
		
		// searching -Linear Search(Algorithm)
		int search = 67;
		// time complexity is O(n)
		for(int i = 0;i <= arr.length - 1 ;i++) {
			if(arr[i] == search ) {
				System.out.println("Element found at index "+ i);
			}
		}
		
		
		
		//Binary Search 
		
		int lo = 0; // lo = 0
		int hi = arr.length-1;  //hi = 4
		
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(arr[mid] == search) {
				System.out.println("Element found at index "+ mid);
				break;
			}
			else if(arr[mid]<search) {
				lo = mid +1;
			}
			
		}
		
		
				
	}
}
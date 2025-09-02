package Arrays;

public class arrayOfThreeNums {

	public static void main(String[] args) {
		int arr[]= {2,0,2,1,1,0};
		int x = 0;
		int y = 0;    // count for number of 1s
		int n = arr.length;
		
		// code for count of number of 0s and 1s
		for(int i =0;i<= n-1;i++) {
			if(arr[i]==0) {
				x += 1;
			}
			else {
				if(arr[i] ==1) {
					y += 1;
				}				
			}
		}
		// code for sorting 0s and 1s into the array
		for(int i =0;i<=n-1;i++) {
			if(i<x) {
				arr[i]=0;
			}
			else {
				if(i>=x && i<n-x) {
					arr[i] = 1;
				}
				else {
					arr[i] = 2;
				}
			}
		}
		//printing the array
		System.out.print("Sorted array: ");
		for(int ele: arr) {
			System.out.print(ele+ " ");
		}

	}

}

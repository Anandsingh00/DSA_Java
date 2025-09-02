package Arrays;

public class swapZeroesOnesTwoes {
	public static void swap(int [] arr, int a , int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b]= temp;
		
	}

	public static void main(String[] args) {
		
		//METHOD-2 DUTCH FLAG ALGORITHM
		int [] arr ={2,0,0,2,1,1,0,2};
		int n = arr.length;
		int lo = 0;
		int mid = 0;
		int hi = n-1;
		
		while(mid<=hi) {
			if(arr[mid]==0) {
				swap(arr,mid,lo);
				mid++;
				lo++;
			}
			else if(arr[mid]==1){
				mid++;
			}
			else {
				swap(arr,mid,hi);
				hi--;
			}
			
		}
		
		for(int ele:arr) {
			System.out.print(ele +" ");
		}
	}
 
	

}

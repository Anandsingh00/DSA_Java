package Arrays;

public class arrayReverse {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8};
		int n = arr.length;
		for(int ele: arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		//int i = 1,j = 5; //Two Pointer method **to find reverse of a part of an array
		int i = 0, j = n-1;// To swap whole array	
		while(i<=j) {
			//function call where passing array , i and j to it
			swap(arr,i,j);
			i++;
			j--;
		}
		for(int ele: arr) {
			System.out.print(ele+" ");
		}

	}
	//making a method - swap and passing array , i and j to it
	public static void swap(int [] arr,int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	

}

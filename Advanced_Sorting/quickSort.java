package Advanced_Sorting;

public class quickSort {
	public static void print(int arr[]) {
		//for printing the array
		for(int ele: arr) {
			System.out.print(ele +" ");
		}
	}
	public static void swap(int [] arr,int i,int j) {
		//function for swapping the elements 
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j] =temp;
	}
	public static int partition(int [] arr,int lo,int hi) {
		//function that creates partition
		int mid =(lo+hi)/2;
		int pivot =arr[mid],  pivotIdx =mid;
		int smallerCount =0;//counts the elements that are smaller than the pivot
		for(int i =lo;i<=hi;i++) {
			if(i==mid) continue;
			if(arr[i]<=pivot) smallerCount ++;
		}
		int correctIdx = smallerCount+lo; // made a index for correct position of the pivot element
		// then swap the elements(the pivot and the respective other position)
		swap(arr,pivotIdx,correctIdx);
		
		//place the elements respective to the pivot element
		int i =lo ,j =hi;
		while(i<correctIdx && j>correctIdx) {
			if(arr[i]<=pivot)i++;
			else if(arr[j]>pivot)j--;
			else if(arr[i]>pivot && arr[j]<=pivot) {
				swap(arr,i,j);
			}
		}
		return correctIdx;
	}
	public static void quicksort(int arr[], int lo,int hi) {
		if(lo>=hi)return;
			int idx =partition(arr,lo,hi);
			quicksort(arr,lo,idx-1);
			quicksort(arr,idx+1,hi);	
	}
public static void main(String [] args) {
	int [] arr= {4,9,7,1,2,3,6,5,8};
	int n = arr.length;
	System.out.print("Unsorted Array:");
	print(arr);
	quicksort(arr,0,n-1);
	System.out.print("\n  Sorted Array:");
	print(arr);
	}
}

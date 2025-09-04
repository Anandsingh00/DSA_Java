package basicSorting;

public class selectionsort2 {
	public static void main(String[] args) {
		int arr[] = {  10, -4, 20, 1, -6, 8 };
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			int max =Integer.MIN_VALUE;
			int maxdx =-1;
			//inner loop
			for(int j=0;j<=n-1-i;j++) {
				if(arr[j]>max) {
					max=arr[j];
					maxdx =j;
				}
			}
			int temp = arr[n-1-i];
			arr[n-1-i] =arr[maxdx];
			arr[maxdx]=temp;
		}
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}
}

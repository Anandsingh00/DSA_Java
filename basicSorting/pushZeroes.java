
package basicSorting;

public class pushZeroes {
 public static void main(String[]args) {
	 int arr[] = {0,0,0,0,6,5,4,3,2,1};
	 int n =arr.length;
	 int count =0;
	
	
	 
	 for(int i =0;i<n;i++) {
		 for(int j =0;j<n-1-i;j++) {
			 if(arr[j]!=0 && arr[j+1]!=0) {
				 if(arr[j]>=arr[j+1]) {
					 int temp =arr[j];
					 arr[j] =arr[j+1];
					 arr[j+1] = temp;
				 }
			 }
			 else if(arr[j]!=0 && arr[j+1]==0)continue;
			 else if(arr[j]==0 && arr[j+1]!=0) {
				 if(arr[j]<arr[j+1]) {
					 int temp =arr[j];
					 arr[j] =arr[j+1];
					 arr[j+1] = temp;
				 }
			 }
		 }
	 }
	 for(int ele: arr) {
		 System.out.print(ele+" ");
	 }
	 
 }
}

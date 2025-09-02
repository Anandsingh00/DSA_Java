package Arrays;

public class rotateArrayM2 {

	public static void main(String[]args) {
		int arr[] = {1,2,3,4,5,6,7}; //6 7 1 2 3 4 5
		int n = arr.length;//7
		int k = 2; //2
		//7-2 =5
		int i = n-k;
		int j =n-1;
		while(i<=j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		int a=0;
		int b=n-k-1;
		while(a<=b) {
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
			a++;
			b--;
		}
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
	}
	}
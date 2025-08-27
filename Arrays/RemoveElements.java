package Arrays;

public class RemoveElements {
	public static void main(String[]args) {
		int arr[] = {3};
		int val = 2;
		
		int i = 0 , j = arr.length-1;
		while(i<j) {
			
			if(arr[i] == val && arr[j] != val) {
				int temp = arr[i];
				arr[i] =arr[j];
				arr[j] = temp;
				i++;
				j--;	
			}
			
			else if(arr[i]!=val) {
				i++;
			}else if(arr[j] == val) {
				j--;
			}
			 
			
		}
		i = 0;
		j = 0;
		
		while(i<=arr.length-1) {
			if(arr[i]!=val) {
				j++;
			}
			i++;			
		}
		System.out.print(j);
		System.out.println();
			for(int ele: arr) {
				System.out.print(ele +" ");
			}
			System.out.println();
			
	}

}

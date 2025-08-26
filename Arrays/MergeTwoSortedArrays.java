package Arrays;

public class MergeTwoSortedArrays {
	public static void printArray(int arr[]) {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();

	}
	public static void main(String[] args) {
		int array1[] = { 10, 20, 30, 40, 50,99,100 };
		int array2[] = { 11, 22,23, 33, 44, 55 };
		int ans [] = mergeArray(array1 , array2);
		printArray(ans);
	}

	public static int[] mergeArray(int[] array1, int[] array2) {
		// create a new array
		int answer[] = new int[array1.length + array2.length];
		
		int  i = 0 , j = 0 , k = 0;//i->array1 | j->array2 | k-> answer array
		
		while(i<array1.length && j<array2.length) {
			
			if(array1[i]<=array2[j]) {
				answer[k] = array1[i];
				i++;
			}
			else {
				answer[k] = array2[j];
				j++;
			}
			k++;
		}
		
		while(i<array1.length) {
			answer[k] = array1[i];
			i++;
			k++;
		}
		while(j<array2.length) {
			answer[k] = array2[j];
			j++;
			k++;
		}
		return answer;

	}
	
}

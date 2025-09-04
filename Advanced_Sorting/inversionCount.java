package Advanced_Sorting;

public class inversionCount {

	static int count;
	public static void print(int[] array) {

		for (int ele : array) {
			System.out.print(ele + " ");
		}
	}
	public static void mergesort(int [] arr) {
		int n =arr.length;
		if(n==1) return;
		int a[] = new int [n/2];
		int b []= new int [n-n/2];
		
		for(int i=0;i<n/2;i++) {
			a[i] =arr[i];
		}
		for(int j =0;j<n-n/2;j++) {
			b[j] = arr[j+n/2];
		}
		
		mergesort(a);
		mergesort(b);
		
		merge (a,b,arr);
	}
	
	public static void merge(int a[] ,int b[],int c[]) {
		int i =0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) c[k++] =a[i++];
			else  c[k++] = b[j++];
		}
		
		while(i<a.length) 	c[k++] =a[i++];
		while(j<b.length) 	c[k++] =b[j++];
		
	}
	
	
	
	public static void main(String []args) {
		int arr[]= {60,67,32,19,89,72,56,63,10};
		mergesort(arr);
		print(arr);
		System.out.println(count);
	}

}
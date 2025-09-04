package LinkedList;

public class swapTwoNums {
	public static void swap(int x, int y) {
		//logic for swapping
		// pass by value -> just the values are passed
		int temp = x;
		 x = y;
		 y = temp;
		 
		 System.out.println("After swapping(inside the function) : "+x+" "+y);
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		System.out.println("Before swapping: "+a+" "+b);
		
		//System.out.println("After swapping: "+a+" "+b);
		 // swap by using a function
		 //function call
		 swap(a,b);
		 System.out.println("After swapping: "+a+" "+b);
	}

}

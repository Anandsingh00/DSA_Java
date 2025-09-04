package BinarySearch;
import java.util.Scanner;
public class sqrt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		int sqr = 0;
		 if(x <= 1) {
	            sqr = x;
	        } else {
	            int lo = 1, hi = x;
	            while (lo <= hi) {
	                int mid = lo + (hi - lo) / 2;
	                if (mid == x / mid) {
	                    sqr = mid;
	                    break;
	                } else if (mid > x / mid) {
	                    hi = mid - 1;
	                } else {
	                    lo = mid + 1;
	                    sqr = mid; // Update square root approximation
	                }
	            }
	        }
		System.out.println("Square Root of Number " + x +" is "+ sqr);
	}

}

package Basics;
import java.util.*;
public class VolOfSphere {
	public static void main(String [] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the radius of circle: ");
		double r = scn.nextInt();
		double vol = 4/3 * 3.147 * r * r * r;
		System.out.println(vol);
	}	
}

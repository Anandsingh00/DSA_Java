package Conditionals;
import java.util.Scanner;
public class leastAmongThreeNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x<y &&x<z) {
			System.out.println(x+" is the least number!");
		}
		else if(y<x && y<z) {
			System.out.println(y+" is least number!");
		}
		else {
			System.out.println(z+" is least number!");
		}

	}

}

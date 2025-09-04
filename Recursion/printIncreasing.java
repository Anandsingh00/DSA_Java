package Recursion;

import java.util.Scanner;

public class printIncreasing {
	public static void print(int num,int endcase) {
		
		if(num>endcase) {
			return;
		}
		else {
			System.out.println(num);
			print(num+1,endcase);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(1,n);
	}

}

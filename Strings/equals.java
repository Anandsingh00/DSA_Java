package Strings;

public class equals {
public static void main(String[] args) {
	String s  ="abcxyz";
	String a  ="abcxyz";
	String b= new String(s);
	String c ="abc";
		c =c+"xyz";
		System.out.println(s==c); // compares the address of the two strings. So we'll get output as false
	System.out.println(b.equals(c));// compares the string so output is true	
}
}

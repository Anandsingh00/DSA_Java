package Strings;

public class stringBuilderInJava {
public static void main(String[] args) {
	String s ="ans";
	StringBuilder sb = new StringBuilder(s);
	System.out.println(sb);
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	StringBuilder sn = new StringBuilder();
	System.out.println(sn.capacity()); //by default it contains 16 
	System.out.println(sn);
	System.out.println(sn.length());
}
}

package Strings;

public class deleteAndInsert {
public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("abcdef");
	System.out.println(sb);
	sb.deleteCharAt(3);
	System.out.println(sb); //abcef
	
	sb.append("xyz");
	System.out.println(sb); //abcefxyz
	sb.delete(2,6);   //deletes characters from 2 to 5
	System.out.println(sb);
	
	sb.insert(2,18);
	System.out.println(sb);
}
}

package Strings;

public class append {
public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("abc");
	System.out.println(sb);
	sb.append(15);
	System.out.println(sb);
	sb.append('*');
	System.out.println(sb);
	sb.append("pqr");
	System.out.println(sb);
//	int [] arr = {1,2,3,4,5};
//	sb.append(arr);     ..Arrays can not be appended in a string builder.Address is being appended
//	System.out.println(sb);
	
	char[] ch = {'@','$','&'};
	sb.append(ch);
	System.out.println(sb);
	StringBuilder t = new StringBuilder("xyz");
	sb.append(t);
	System.out.println(sb);
//	s+="abc";  ..Not Valid In stringbuilder
}
}

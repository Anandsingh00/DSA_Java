package Strings;

public class updateEvenPosition {
	public static void main(String[] args) {
		String s = "anand raj singh";
		String str ="";
		
		for(int i=0;i<s.length();i++) {
			if(i%2!=0) {
				str+=s.charAt(i);
			}
			else {
				str+='a';
			}
		}
		
		System.out.println(	str);
	}
}

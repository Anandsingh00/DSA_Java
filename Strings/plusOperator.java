package Strings;

public class plusOperator {

	public static void main(String[] args) {
		String s ="anand ";
		String t ="singh";
		s +=t;
		System.out.println(s);
		
		System.out.println("abc"+10+20); //abc10+20 -> abc1020
		System.out.println(10+20+"abc");//30+abc    ->30abc
	}

}

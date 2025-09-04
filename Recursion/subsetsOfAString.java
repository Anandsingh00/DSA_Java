package Recursion;
import java.util.ArrayList;
public class subsetsOfAString {
	static ArrayList<String> arr = new ArrayList<>();
	public static void subsets(int i,String s,String sub) {
		if(i==s.length()) {
			arr.add(sub);
		return;		
		}
		char ch =s.charAt(i);
		subsets(i+1,s,sub); //not take
		subsets(i+1,s,sub+ch); //take
		
	}

	public static void main(String[] args) {
		String s = "abc";
		arr = new ArrayList<>();
		subsets(0, s, "");
		System.out.println(arr); 	
	}
}

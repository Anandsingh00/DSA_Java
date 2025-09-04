package basicSorting;
import java.util.ArrayList;
import java.util.List;
public class removeString {
	public static List<String> tokenizer (String str){
		List<String>List =new ArrayList<>();
			for(String s :str.split("//s+")) {
				List.add(s);
			}
		return List;
	}
public static void main(String[]args) {
	String s ="Axc 78 Czy 60";
	int x =77;
	List<String> List =tokenizer(s);
}
}

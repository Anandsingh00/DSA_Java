package oops;

public class sample2 {
	public static void main(String[]args) {
		Rear rear = new Rear();
		System.out.println(rear.xyz(new Rear()));
	
	}
}
class Tiger {
	public String xyz(Object obj) {
		return "Tiger";
	}
}
class White extends Tiger{
	public String xyz(Object obj) {
		return "White";
	}
}

class Rear extends White{
	public String xyz(Object obj) {
		return "Rear";
	}
}

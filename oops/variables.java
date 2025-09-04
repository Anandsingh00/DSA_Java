package oops;

public class variables {

	static class Calculator{
		public void add(int a ,int b) {
			int result =a+b;
			System.out.println("sum :"+result);
		}
	}
	public static void main(String []args) {
		Calculator c = new Calculator();
		c.add(3, 4);
	}
}

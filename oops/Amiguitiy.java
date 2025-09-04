package oops;
class Calculator{
	public void add(int a) {
		System.out.println("int-argument ");
	}
	public  void add(float a) {
		System.out.println("float-argument");
	}
	
}

public class Amiguitiy {
public static void main(String[]args) {
	Calculator c = new Calculator();
	c.add('a');//char--> char,int
	c.add(10L); //long -->long,float,double
	c.add(0); //double-->double
}
}

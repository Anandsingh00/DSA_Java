package oops;

public class inheritance {

	static class Employee{
		public String name;
		public int age;
	
	Employee(){
		
		System.out.println("Employee constructor called...");
	}
	public  void display() {
		System.out.println("Name:: "+name);
		System.out.println("Age:: "+ age);
	}
	}
	public static void main(String []args) {
		Employee e1 =new Employee();
		e1.display();
		
	}
}

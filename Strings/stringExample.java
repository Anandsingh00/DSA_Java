package Strings;

public class stringExample {

	public static void main(String[] args) {
		
		String greeting = "Hello";
		String name = "John";
		
		String 	message = greeting + name;
		
		System.out.println(message);
		int length = message.length();
		System.out.println("Length of the message: " + length);
		
		char firstChar = message.charAt(0);
		System.out.println("First chearacter: " + firstChar);
		
		String substring = message.substring(7);
		System.out.println("Substring from index 7: " + substring);
		
		String 	anotherName = "John";
		boolean isEqual = name.equals(anotherName);
		System.out.println("Names are  equal: " + isEqual);
	}

}

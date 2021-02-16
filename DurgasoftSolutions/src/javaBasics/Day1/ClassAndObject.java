package javaBasics.Day1;

public class ClassAndObject {
	// Properties - data
	int a = 10, b = 20, c;
	
	// Behaviors - Operations
	public static void main(String[] args) {
	// Object creation syntax: Class name, reference variable(any) = new keyword, Class name with closed brackets
	// using Object reference variable, we can access the global/instance variables or methods
		
		ClassAndObject obj = new ClassAndObject();
		obj.add();
		obj.sub();

	}
	
	public void add() {
		c = a+b;
		System.out.println("addition of a & b is:" + c);
	}
	
	public void sub() {
		c = a-b;
		System.out.println("subtraction of a & b is:" + c);
	}

}

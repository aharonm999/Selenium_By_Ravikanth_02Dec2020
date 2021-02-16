package javaBasics.Day5;

public class Variables {
	
	// Instance / Global / Non-static Variables
	int i = 10;
	String name = "Tweety";
	
	// Instance / Global / Static Variables
	static int j = 20;
	static String color = "Black";
	
	public void m1() { // Non-static method
		int i = 20; // Local Variables - Local variables of m1()
		String name = "Veronica"; // Local Variables - Local variables of m1()
		
		// Calling 'Local' variables of m1()
		System.out.println(i);
		System.out.println(name);
		
		// Calling instance variables using 'this' key word. : we use 'this' keyword when we have data with same reference variable. 
		System.out.println(this.i); 
		System.out.println(this.name);
		
		// Calling instance variables by creating an object
		Variables obj = new Variables();
		System.out.println(obj.i);
		System.out.println(obj.name);
		
		// Calling static variables in m1() - Directly
		System.out.println(j);
		System.out.println(color);
		
		// Calling static variables in m1() - Using class name
		System.out.println(Variables.j);
		System.out.println(Variables.color);
		
		
	}
	
	public static void main(String[] args) {

		int i = 30; // Local Variables - Local variables of main()
		// Calling 'Local' variables of main()
		System.out.println(i);
		
		// Calling 'instance' variables in main()
		Variables obj = new Variables();
		System.out.println(obj.i);
		System.out.println(obj.name);
		
		// Calling 'static' variables in main()
		// We can call static methods in two ways : 1. By calling directly 2. By calling using class name.
		// 1. By calling Directly
		System.out.println(j);
		System.out.println(color);
		
		// 2. By calling using class name
		System.out.println(Variables.j);
		System.out.println(Variables.color);
		
		// Calling non-static method m1()
		obj.m1();
	}

}

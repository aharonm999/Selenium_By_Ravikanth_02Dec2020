package javaBasics.Day4.One;

public class B extends A{
	
	public void b1() {
		System.out.println("B1 method from class B");
	}
	
	public void b2() {
		System.out.println("B2 method from class B");
	}
	
	public static void main(String[] args) {
		
		B obj = new B();
		obj.a1();
		obj.a2();
		//obj.a3();
		
		//We can call parent abstract class by using child reference variable.
		A obj1 = new B();
		obj1.a1();
		obj1.a2();
		//obj1.a3();
		
		//B obj2 = new A(); // We cannot inherit parent abstract class by using parent reference variable in child class. We can call by using child reference variable.
	}

	/*@Override
	void a3() {
		System.out.println("Abstact method from class A");
		
	}*/
	
	
	
	
	
	

}

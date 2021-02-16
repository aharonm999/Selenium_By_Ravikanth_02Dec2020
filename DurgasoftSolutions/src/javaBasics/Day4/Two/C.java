package javaBasics.Day4.Two;

import javaBasics.Day4.One.A;

public class C extends A{
	
	public void c1() {
		System.out.println("C1 method from class C");
	}

	public void c2() {
		System.out.println("C2 method from class C");
	}
	
	public static void main(String[] args) {
		
		C obj = new C();
		obj.a1();
		obj.a2();
	//	obj.a3();
		
		//We can call parent abstract class by using child reference variable.
		A obj1 = new C();
		obj1.a1();
		obj1.a2();
		//obj1.a3();
		
		//C obj2 = new A(); // We cannot inherit parent abstract class by using parent reference variable in child class. We can call by using child reference variable.
	}

	/*@Override
	public void a3() {
		System.out.println("Abstact method from class A");
		
	}*/
}

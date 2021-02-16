package javaBasics.Day3;

public class ChildClass extends AbstactClassConcept{

	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		
		obj.m1(); // From Abstract class
		obj.m2(); // From Abstract class
		obj.m3(); // From Child class
		obj.m4(); // From Child class
	}

	@Override
	public void m3() {
		
		System.out.println("Overriden M3 method from Abstract class");
	}

	@Override
	public void m4() {
		
		System.out.println("Overriden M4 method from Abstract class");		
	}

}

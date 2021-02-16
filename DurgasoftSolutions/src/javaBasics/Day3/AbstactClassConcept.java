package javaBasics.Day3;

/*
 - In Abstract class we have to give 'abstract' key explicitly. Where as in 'Interface' implicitly we have 'abstract' key word in method.
 - We can't access abstract methods directly by creating an object in the same class, like normal class.  
 - We need to create a child class and by extending the abstract class from child class we can implement the unimplemented methods in child class. Also can
   access the methods by creating an object.
 - Abstract class can have both "concrete methods[normal methods]" and "abstract methods". But a normal class can't have abstract methods. it can have only normal methods.
 */
public abstract class AbstactClassConcept {
	
	int i = 10;
	
	// Concrete methods [Normal methods]
	
	public void m1() {
		
		System.out.println("M1 method from Abstract class");
	}
	
	public void m2() {
		
		System.out.println("M2 method from Abstract class");
	}
	
	// Abstract methods
	
	public abstract void m3();
	
	public abstract void m4();

}

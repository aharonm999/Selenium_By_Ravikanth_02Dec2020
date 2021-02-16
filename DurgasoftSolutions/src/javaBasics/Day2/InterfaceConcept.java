package javaBasics.Day2;

/* 
 - Interface doesn't contain main()
 - Interface have only Abstract methods, which contains no body/body implementation.
 - Methods declared in an interface must be implemented in a separate class to use them, by using 'implements' keyword.
 - When we use Interface? : When the requirements are dynamic from Vendor-Vendor then we user interface.
 - We can't create Objects in interface directly.
 - We can create Object in interface, When we implemented interface in child classes and its Object can be created in Interface.
   [This concept is called as - POLYMORPHISM ] i.e one ---> Many concept.
 */

public interface InterfaceConcept {
	
	int i = 10;
	
	public void Login();
	
	public void Banking();
	
	public void BalanceInquire();
	
	public void Withdrwal();
	
	public void BalanceCheck();
	
// POLYMORPHISM concept
	
public static void main(String[] args) {
		
		InterfaceConcept obj;
		
		obj = new SbiBank();
		obj.Login();
		obj.Banking();
		obj.BalanceInquire();
		obj.Withdrwal();
		obj.BalanceCheck();
		
		obj = new PnbBank();
		obj.Login();
		obj.Banking();
		obj.BalanceInquire();
		obj.Withdrwal();
		obj.BalanceCheck();
		
	}
	
}



	


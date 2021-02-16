package javaBasics.Day2;

public class SbiBank implements InterfaceConcept{

	public static void main(String[] args) {
		
		SbiBank sbi = new SbiBank();
		sbi.Login();
		sbi.Banking();
		sbi.BalanceInquire();
		sbi.Withdrwal();
		sbi.BalanceCheck();
	}

	@Override
	public void Login() {
		
		System.out.println("SBI Logined Successfully");
	}

	@Override
	public void Banking() {
		
		System.out.println("SBI Banking Selected");
	}

	@Override
	public void BalanceInquire() {
		
		System.out.println("SBI Balance Inquired");
	}

	@Override
	public void Withdrwal() {
	
		System.out.println("SBI Cash Withdrawn");
	}

	@Override
	public void BalanceCheck() {
		
		System.out.println("SBI Balance checked");
	}

}

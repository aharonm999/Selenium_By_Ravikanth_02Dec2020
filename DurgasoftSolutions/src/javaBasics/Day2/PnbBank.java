package javaBasics.Day2;

public class PnbBank implements InterfaceConcept{

	public static void main(String[] args) {
		
		PnbBank pnb = new PnbBank();
		pnb.Login();
		pnb.Banking();
		pnb.BalanceInquire();
		pnb.Withdrwal();
		pnb.BalanceCheck();

	}

	@Override
	public void Login() {
		
		System.out.println("PNB Logined Successfully");
	}

	@Override
	public void Banking() {
		
		System.out.println("PNB Banking Selected");
	}

	@Override
	public void BalanceInquire() {
		
		System.out.println("PNB Balance Inquired");
	}

	@Override
	public void Withdrwal() {
	
		System.out.println("PNB Cash Withdrawn");
	}

	@Override
	public void BalanceCheck() {
		
		System.out.println("PNB Balance checked");
	}


}

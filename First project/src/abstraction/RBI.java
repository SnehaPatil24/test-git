package abstraction;

public abstract class RBI {
		
	//normal method-non abstract method which is common to all the child class
	public void PinValidation() {
		
		System.out.println("When you insert the card system should ask for 4 digit pin");
	}
	
	public final void Balance() {
		System.out.println("Balance of your account is ");
	}
	
	//Cashwithdram is different process within each bank
	public abstract void Cashwithdraw();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//Class need to implement abstract method of parent class
class ICICIATM extends RBI{


	public void Cashwithdraw() {
		
		System.out.println("Once pin is verified customer can withdraw the card");
		
	}
	
	public static void main(String[] args) {
		ICICIATM obj=new ICICIATM();
		obj.Balance();
		// obj1 is reference of parent class(abstract) and pointing to child class object
		RBI obj1=new ICICIATM();
		
		
	}
	

}
//Class need to implement abstract method of parent class
class HDFCATM extends RBI{

	@Override
	public void Cashwithdraw() {
		System.out.println("Customer cannot withdraw the card till transcation is not completed");
		
	}
	
}

//Class need to implement abstract method of parent class
/*class HDFCATM extends RBI{

	@Override
	public void Cashwithdraw() {
		System.out.println("Customer cannot withdraw the card till transcation is not completed");
		
	}
	
}*/
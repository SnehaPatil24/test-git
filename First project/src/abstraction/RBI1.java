package abstraction;

public abstract class RBI1 {
  abstract void cashwithdraw();
  public static void M1()
  {
	  System.out.println("i am static method");
  }
  public final void M2()
  {
	  System.out.println("I am final method");
  }
}
class ICICATM1 extends RBI1{

	 public void cashwithdraw() {
		System.out.println("i will read card and will release card");
		System.out.println("cash withdraw");
	}
	//ATM --cashwithdraw but in our case we will first read card
	//take card and we will perform transcation
}
class HDFCATM1 extends RBI1
{


	public void cashwithdraw() {
		System.out.println("i will read card and but will release card after transation is over");
		System.out.println("cash withdraw");
		
	}
	//ATM --cashwithdraw but will not release card till transaction is over
}

package abstraction;

abstract class CentralGovt
  {  
	// instance variable
	 int a;
	
	 public CentralGovt()
	 {
		 a=20;
	 }
	 //one which is applicable across state-income tax%
	//one which will be declare by central govt but it has to implement by state govt
	  public int incometaxpercentage()
	  {
		  return 1;
	  }
	  //certral govt should not implement foodscheme
	  public abstract void foodscheme();
	  
  }

//class which extends abstract class has to implement abstract method
public class StateGovt extends CentralGovt{
    
	public static void main(String[] args) {
		StateGovt g=new StateGovt();
	System.out.println(g.a);
	}
    public StateGovt() {
    	
    }
	@Override
	public void foodscheme() {
		// TODO Auto-generated method stub
		
	}
}

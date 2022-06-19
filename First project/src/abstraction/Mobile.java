package abstraction;

public interface Mobile {

	  void calling();
	  void msg();
	  void song();
	  void DuplicateApp();
	  void M1();
	 
}

//implements-interface implementation
//abstract - if your class is not implementing all absteact method of parent
//override-m1 is override
abstract class BaseClass implements Mobile
{
	public void DuplicateApp() {
		
	}
	public void M1()
	{
		System.out.println("this is default implementation");
	}
}
class samsung extends BaseClass{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void song() {
		// TODO Auto-generated method stub
		
	}
    public void M1() {
    	System.out.println("this is own implementation");
    }
	
}
class Nokia extends BaseClass
{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void song() {
		// TODO Auto-generated method stub
		
	}

	

	
	
}

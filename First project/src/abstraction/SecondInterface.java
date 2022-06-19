package abstraction;

public interface SecondInterface {
    
	void M1();
}
interface Third
{
	void M2();
}
//class Test implements SecondInterface,Third
//can we consider multiple inheritance
class Test implements SecondInterface,Third
{

	@Override
	public void M2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void M1() {
		// TODO Auto-generated method stub
		
	}
	
}

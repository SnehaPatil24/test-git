package overriding;

public class FourWheeler {
	
	//instance method
	public void speed()
     {
	  System.out.println("I am in parent class speed method ,every 4wheller should have 900 cc minimum");
     }
	public int Gear()
	{
		System.out.println("by default i will provide 4 gear");
		return 4;
	}
}

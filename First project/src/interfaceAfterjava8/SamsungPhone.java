package interfaceAfterjava8;
//default method is not mandatory to implement in class
//but it become mandatory to implement when more one interface
//and when two or more interface is having same default method
interface mobile{
	//if you want method implementation interface default /static
	//default method is not mandatory to implementing 
	public default void calling()
	{
		System.out.println("device is consider as mobile when it has calling feature");
	}
	void design();
}
interface smartPhone
{
	public default void calling()
	{
		System.out.println("device is consider as smart mobile when it has touch screen feature");
	}
	void design();//public abstract void design();
	int nodialing();
}
public class SamsungPhone implements mobile,smartPhone{
  public static void main(String[] args) {
	  SamsungPhone s=new SamsungPhone();
	  s.design();
	  s.calling();
	  s.nodialing();
}

@Override
    public void design() {
	// TODO Auto-generated method stub
	System.out.println("Samsung design");
}

@Override
public void calling() {
	//either you call interface method
	//mobile.super.calling();
	//you can write your own implementation
	System.out.println("this is class calling method");
}

@Override
public int nodialing() {
	System.out.println("touch screen can be used to dial no");
	return 0;
}
  
}

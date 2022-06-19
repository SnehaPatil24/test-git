package abstraction;

public class MyfirstinterfaceImplementation implements MyInterface{
   public static void main(String[] args) {
	   MyfirstinterfaceImplementation obj=new MyfirstinterfaceImplementation();
	   obj.firstmethod();
	   //can we create object of interface-->no
	   MyInterface p=new MyfirstinterfaceImplementation();
	   p.firstmethod();
	   
}
	@Override
	public void firstmethod() {
		System.out.println("I am first method");		
	}
	
	public void TC1()
	{
		System.out.println("I am normal method");
	}

}

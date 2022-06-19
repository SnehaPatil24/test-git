package overriding;

class MethodHidingParent
{
	public static void publicGarden()
	{
		System.out.println("I am public Garden of Parent class");
	}
	public void M1()
	{
		System.out.println("I am parent class M1");
	}
}
public class MethodHiding extends MethodHidingParent {

	public static void main(String[] args) {
		
		MethodHidingParent p=new MethodHiding();
		p.M1();//child class
		p.publicGarden();//static method are class level method
	}
	public static void publicGarden()
	{
		System.out.println("I am public Garden of child class");
	}
	public void M1()
	{
		System.out.println("I am child class M1");
	}

}

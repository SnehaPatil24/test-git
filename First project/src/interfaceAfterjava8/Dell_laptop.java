package interfaceAfterjava8;
interface laptop{
	//interface can have method implementation default and static
	public default void screensize()
	{
		System.out.println("laptop interface screen size");
	}
	public static void operatingsystem()
	{
		System.out.println("laptop interface operatingsystem");
	}
}
interface macbook
{
	public default void screensize()
	{
		System.out.println("macbook interface screen size");
	}
	public static void operatingsystem()
	{
		System.out.println("macbook interface operatingsystem");
	}
}
public class Dell_laptop implements laptop,macbook{

	public static void main(String[] args) {
		laptop.operatingsystem();
		macbook.operatingsystem();

	}

	@Override
	public void screensize() {
		// TODO Auto-generated method stub
		laptop.super.screensize();
	}

}

package demo;

public class Overloadingmain {
	public static void main(int a)
	{
		System.out.println("main (int a)");
	}
	public static void main(double a)
	{
	 System.out.println("main (double a)");	
	}
public static void main(String[] args) {
	main(10);
	main(10.5);
}
}

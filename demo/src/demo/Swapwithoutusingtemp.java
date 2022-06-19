package demo;

public class Swapwithoutusingtemp {

	static void swap(int a ,int b)
	{
		a=(b-a)+(b=a);
		System.out.println("a=" +a);
		System.out.println("b=" +b);
	}
	public static void main(String[] args) {
		int a=10;
		int b=30;
		System.out.println("before swappping");
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		System.out.println("after swapping");
		Swapwithoutusingtemp.swap(a, b);
	}
}

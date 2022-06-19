//method overloading
package demo;

public class Calculate {

	static void area(int s)
	{
		int a=s*s;
		System.out.println("area of square is" +a);
	}
	static void area(int l, int b)
	{
		int a=l*b;
		System.out.println("area of rectangle is" +a);
	}
	static void area(double r)
	{
		double a=3.14*r*r;
		System.out.println("area of circle is " +a);
	}
	public static void main(String[] args) {
		area(2);
		area(2,3);
		area(3.5);
	}
}

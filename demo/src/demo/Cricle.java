//parameterized counstructor
package demo;

public class Cricle {
	double radius;
	Cricle(double r)
	{
		radius=r;
		double a=3.14*radius*radius;
		System.out.println("area is:"+a);
	}
	public static void main(String[] args) {
		Cricle c1=new Cricle(2.3);
		Cricle c2=new  Cricle(4.5);
	}

}

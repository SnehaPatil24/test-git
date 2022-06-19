//constructor demo
package demo;

public class Constsample1 {
	Constsample1()
	{
	 System.out.println("running demo1 constructor");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		Constsample1 c1=new Constsample1();
		System.out.println("----------------------");
		Constsample1 c2=new Constsample1();
		System.out.println("main ends");
	}
}

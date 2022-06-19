
public class A {

	String m11(String X)
	   {
		   System.out.println("One");
		   return "ABC";
	   }
	String m1(String y)
	   {
		   System.out.println("TWO");
		   return "PQR";
	   }
	public static void main(String[] args) {
		A a=new A();
		a.m11("ABC");
	}
}

/*1. Create one class as MathematicalOperation,write following methods
A. Add method with two int parameter
B. Add method with one float and one int parameter and return the float. 
   Print the value in main method
C. Add one method as Sub with three parameter double, float and int
*/
package Assignment;

public class MathematicalOperation {

	public static void main(String[] args) {
		MathematicalOperation obj=new MathematicalOperation();
		
		float x= obj.add(23.4f, 12);
		System.out.println("addition of flaot no. and int no. is = " +x);
		
		int p=MathematicalOperation.add(34,54);
		System.out.println("addition of 2 int no. is = "+p);
		
		double r=MathematicalOperation.sub(55.4d,34.4f,12);
		System.out.println("Substraction of three parameter double, float and int is ="+r);;
	}
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public float add(float a,int b)
	{
		float c=a+b;
		return c;
	}
	public static double sub(double a,float b,int c)
	{
		double d=a-b-c;
		return d;
	}

}

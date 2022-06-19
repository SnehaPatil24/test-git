package MethodOverloading;

public class AddwithoutmethodOverloading {
	//ADD - 
		// 1. IT SHOULD ALLOW TO SUM TWO NUMBERS
		//2. IT SHOULD SUPPORT INT AND DOUBLE
		//3. IT SHOULD ALSO SUPPORT THREENUMBERS
	public static void main(String[] args)
	{
		//mathod calling in main method because JVM execute only code written main
		AddwithoutmethodOverloading obj=new AddwithoutmethodOverloading();
		
		int s=AddwithoutmethodOverloading.add3(12, 32, 23);
		System.out.println("addition of 3 no "+s);
		
		int r=AddwithoutmethodOverloading.add1(12, 65);
		System.out.println("addition of 2 no "+r);
		
		double p=obj.add2(23.4,75.1);
		System.out.println("addition of 2 double no "+p);
		
		double x=obj.add4(43.2,54.3, 76.1);
		System.out.println("addition of 3 double no "+x);
	}
	//WMethod Syntax 
		//<ACCESS_MODIFIER><NON_ACCESS_MODIFIER> <RETURN_TYPE> <METHOD-NAME>()
		
		//METHOD IMPLEMENTATION - 
		//scope of local variable is within the method 
		//private within the class
		
		/*
		 * Method Type -Static 
		 * Return type -int
		 * Method name=Addition
		 * No of parameter -2
		 * Type of parameter -local
		 * Data type of parameter -both int
		 * 
		 */
	 static int add1(int a,int b)
	 {
		 int c=a+b;
		 return c;
		
	 }
	 //we have to write another method which will take double 
	 /*
		 * Method Type -Non-Static/Instance 
		 * Return type -double
		 * Method name=Add
		 * No of parameter -2
		 * Type of parameter -local
		 * Data type of parameter -both double
		 * 
		 */
	 protected double add2(double a,double b)
	 {
		 double c=a+b;
		 return c;
		
	 }
	 /*
		 * Method Type -Static 
		 * Return type -int
		 * Method name=AdditionThree
		 * No of parameter -3
		 * Type of parameter -local
		 * Data type of parameter -all int
		 * 
		 */
		
	 public static int add3(int a,int b, int c)
	 {
		 int d=a+b+c;
		 return d;
	 }
	 /*
		 * Method Type -Non-Static 
		 * Return type -double
		 * Method name=AddThree
		 * No of parameter -3
		 * Type of parameter -local
		 * Data type of parameter -all double
		 * 
		 */
	 protected double add4(double a,double b,double d)
	 {
		 double c=a+b+d;
		 return c;
	 }
	 
}

//3. Java Program to Swap Two Numberss
package Assignment;

public class SwapNoWithoutMethod {
     int a;
     static int b;
	public static void main(String[] args) {
		
		SwapNoWithoutMethod obj=new SwapNoWithoutMethod();
		
		obj.a=43;
		SwapNoWithoutMethod.b=54;
		
		System.out.println("before swapping value of a and b "+obj.a+" "+SwapNoWithoutMethod.b);
		int temp =obj.a;
		obj.a=SwapNoWithoutMethod.b;
		SwapNoWithoutMethod.b=temp;
		System.out.println("after swaping value of a and b "+obj.a+" "+SwapNoWithoutMethod.b);
		
	}
	
	
}

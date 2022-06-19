//3. Java Program to Swap Two Numbers
package Assignment;

public class SwapNoWithMethod {
	int a;
    static int b;
	public static void main(String[] args) {
		
		SwapNoWithMethod obj=new SwapNoWithMethod();
		
		obj.a=43;
		SwapNoWithMethod.b=54;
		
		System.out.println("before swapping value of a and b "+obj.a+" "+SwapNoWithMethod.b);
		obj.swap(obj.a,SwapNoWithMethod.b);
	   //System.out.println("after swaping value of a and b "+x);
		
	}
	
	public void swap(int a,int b)
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
       System.out.println("after swapping value of a and b "+a+" "+b);
		
	}
}

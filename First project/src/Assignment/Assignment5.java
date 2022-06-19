/*Create another class having two static method without return type and
 *having one float parameter Add print statement in method body an 
 *Call these above method in main 
*/
package Assignment;

public class Assignment5 {
	public static void main(String[] args) {
		//Assignment3 obj=new Assignment3();
		Assignment5.add(99.2f);
		Assignment5.sub(54.3f);
		

	}
	public static float add(float a)
	{
		
		int b=98;
		float c=a+b;
		System.out.println("addition of 2 no is "+c);
		return c;
	}

	public static float sub(float a)
	{
		
		int b=22;
		float c=a-b;
		System.out.println("substraction of 2 no is "+c);
		return c;
	}

}

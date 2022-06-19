/*Create another class having two static method having float return type
 *and having one float parameter Add print statement in method body an 
 *Call these above method in main 
 */

package Assignment;

public class Assignment7 {
	
	public static void main(String[] args) {
		
		Assignment7.add(50.9f);
		Assignment7.sub(58.9f);
		

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

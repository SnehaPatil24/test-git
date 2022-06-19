/*Create one class having two instance method having int return type and 
  *having one int parameter Add print statement in method body and
  *Call these above method in main  
*/
package Assignment;

public class Assignment6 {

	public static void main(String[] args) {
		Assignment6 obj=new Assignment6();
		
		obj.add(56);
		obj.sub(98);
	}
	public int add(int a)
	{
		int b=98;
		int c=a+b;
		System.out.println("addition of 2 no is "+c);
		return c;
	}

	public int sub(int a)
	{
		
		int b=22;
		int c=a-b;
		System.out.println("substraction of 2 no is "+c);
		return c;
	}
}

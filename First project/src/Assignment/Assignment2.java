/*Create one class having two instance method without return
 type and no parameter Add print statement in method body an 
 Call these above method in main 
*/

package Assignment;

public class Assignment2 {

	public static void main(String[] args) {
		Assignment2 obj=new Assignment2();
		
		obj.add();
		obj.sub();
	}
	public void add()
	{
		int a=76;
		int b=98;
		int c=a+b;
		System.out.println("addition of 2 no is "+c);
	}

	public void sub()
	{
		int a=42;
		int b=22;
		int c=a-b;
		System.out.println("substraction of 2 no is "+c);
	}

}

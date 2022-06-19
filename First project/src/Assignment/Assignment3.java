/* Create another class having two static method without return type
 and no parameter  Add print statement in method body an 
 Call these above method in main 
*/

package Assignment;

public class Assignment3 {
	public static void main(String[] args) {
		//Assignment3 obj=new Assignment3();
		Assignment3.add();
		Assignment3.sub();
		

	}
	public static void add()
	{
		int a=87;
		int b=98;
		int c=a+b;
		System.out.println("addition of 2 no is "+c);
	}

	public static void sub()
	{
		int a=99;
		int b=22;
		int c=a-b;
		System.out.println("substraction of 2 no is "+c);
	}

}

/*Create one class having two instance method without return type
 and having one int parameter Add print statment in method body an
 Call these above method in main  
*/

package Assignment;

public class Assignment4 {

	public static void main(String[] args) {
		Assignment4 obj=new Assignment4();
		
		obj.add(87);
		obj.sub(66);
	}
	public void add(int a)
	{
		int b=98;
		int c=a+b;
		System.out.println("addition of 2 no is "+c);
	}

	public void sub(int a)
	{
		
		int b=22;
		int c=a-b;
		System.out.println("substraction of 2 no is "+c);
	}
}

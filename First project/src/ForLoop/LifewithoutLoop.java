package ForLoop;

public class LifewithoutLoop {
public static void main(String[] args) {
		
		//print the 1 to 10 number without for loop
		
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		
		int var;  //declaration
		var=1; //initialization
		int var1=9; //declaration +initialization
		
		
		// Again printing the value from 1 to 10 with for loop 
		// when you have to run some set of statement/code multiple time then use loops
		// now we have some condition to tell java how many times we have to iterate or execute the loop
		for(int i=1;i<=10;i++)  //i=2
			// I have one variable whose name is i and its value is 1
			// Please run the code till i value is either less than 10 or equal to 10
		{
			System.out.println(i); //
			
		}
		
		for(int i=10;i>=1;i--)  //i=2
			// I have one variable whose name is i and its value is 1
			// Please run the code till i value is either less than 10 or equal to 10
		{
			System.out.println(i); //
			
		}
		
		// printing the odd number from 1 till 25
		for(int i=1;i<=25;i+=2)  //i=i+2
			// I have one variable whose name is i and its value is 1
			// Increment the value by 2 as after 1 we have to print 3
		{
			System.out.println(i); //
			
		}
		
		
	}
}

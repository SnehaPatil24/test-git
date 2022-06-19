package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingRule {
	static int[] a;
	public static void main(String[] args) {
		
		//try block always need to have catch block
		try {
			//unchecked --exception which will not be checked at compile time
			//there is no mandate to handle unchecked exception
			System.out.println(a[0]);
		}
		//System.out.println("");
		/*you cannot write any statement between try and catch 
		  catch should be written immediately after try*/
		catch(NullPointerException p)
		{    
			p.printStackTrace();// it will print type ,msg ,location in this method  
			System.out.println(p.toString());
		    System.out.println("i am in null pointer catch block " +p.getMessage());
		}
		//try block can have multiple catch block
		/*catch block cannot be written without try block
		catch(NullPointerException a)
		{
			
		}*/
		
		//checked exception --exception which will be checked at compile time
		//java will force to handle that exception
		try {
			Scanner p= new Scanner(new File(""));
		} catch (FileNotFoundException e) {
			System.out.println("i am in FileNotFound catch  block");
			//e.printStackTrace();
		}
		System.out.println("now end of program");
	}
}

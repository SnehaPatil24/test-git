package operator;

public class ArithematicOperators {

	//instance variable -declare within the class outside the method
	//without static keyword 
	int a=55; // = is called as assignment operator 
	private int b=20;
	// Static variable
	protected static int c=34;
	static int d=45;
	

	public static void main(String[] args) {
		//Classname objectname/reference=new Classname();
		ArithematicOperators obj=new ArithematicOperators();  
		
		// Objectname.Variablename 
		//obj.a   obj.b
		
		// To do addition in java we use + sign 
		System.out.println("Addition of two number " + (obj.a+obj.b));

		// To do substraction in Java we use - Sign
		System.out.println("Substraction of two number " + (ArithematicOperators.c -ArithematicOperators.d));
		
		// To do multiplication in java use * sign
		System.out.println("Multiplication of two number " + (obj.a*ArithematicOperators.c));
		
		// To do division in java use / sign     
		// if your data type is int then it will only show no decimal value
		System.out.println("division of two number " + (obj.a/ArithematicOperators.c));
		
		//To find reminder we use % (modulus Operator) in java
		System.out.println("Multiplication of two number " + (obj.a%ArithematicOperators.c));
				
		
		  
	}
}

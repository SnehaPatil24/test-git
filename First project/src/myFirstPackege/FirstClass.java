package myFirstPackege;

public class FirstClass {
	//access modifier- public
		// data type -byte and variable a
		//With java each and every line is called as statement 
		// statement is ended with semicolon
		//If declare something without assign a value 
		public static byte a; //(2*-7 to 2^7-1) //a is declare at line 10
		protected short b=27; //for b declaration and initilization is in one line
		private int c;
		long d; // default long d
		public boolean e; //access mo
		protected char f;
		private float g;
		double h;
		
		public static void main(String[] args) {
			//Local variable is declare inside the method
			// our method name is main 
			//<Access_Modifier> datatype variablename;
			//local variable can access within the method only
			int s;//by default local variable is only accessible within the method
			
			
			
			//a=10; //initilization at line 20
			//ClassName nameofobject/reference=new Classname();
			FirstClass obj=new FirstClass();
			System.out.println("This is my first output on console");
			//a is variable and obj is the name of the object
			System.out.println("This is value of a= "+obj.a);//test+10=test10
			System.out.println("this is default value of boolean "+obj.e); //false
			System.out.println("This is default value of float " +obj.g);
			//byte-->short-->int-->long
			obj.c=2147483647;
			//By default long will be created as int
			//first size will be 4 byte  
			// l will use to tell java to assign 8 byte
			obj.d=2147483648l;
			//float size is 4 byte 
			//If you are using decimal then by default it is double
			//double size is 8 byte
			obj.g=34.34f;
		}
}

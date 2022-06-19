package operator;

public class Arithmatic_Operators {
	//instance variable
		int a=25;
		//25 is literal 
		//Literal is nothing but value assign to a variable
		public static int b=35;
		
		public static void main(String[] args) {
			Arithmatic_Operators obj=new Arithmatic_Operators();
			Arithmatic_Operators.b=35;
		
			//If you want to the execute anything 
			//we have to call in main
			//Add method is type of instance 
			//Method calling 
			//objectname.methodname();
			//obj.Add(obj.a,Arithmatic_Operators.b);
			int addition=obj.Add(obj.a, Arithmatic_Operators.b);
			System.out.println("+ operator is used for addition " + addition);

			// objectname.methodname(parameter);
			int substraction=obj.Sub(obj.a, Arithmatic_Operators.b);
			//obj.sub(25,35);
			System.out.println("- operator is used for substraction " + substraction);
			
			// If you want to multiplication which operator *
			//Addition -+
			//Substraction- -
			System.out.println("Addition of two number " + (56+56));
			System.out.println("Sub of two number" + (45-10));
			System.out.println("Multiplication of two number" + (4*5));
			
			int y=obj.multi(6, 6);
			System.out.println("Multiplication through method "+ y);
		
			// If you want to divide two number /
			
			System.out.println("Division of two number " + (5/2));
			System.out.println("Modulus of two number " + (5%2));
		}
		
		//Add Method-instance method
		//Method implementation 
		//a and b are local variable 
		//scope of local variable is within the method 
		public int Add(int a,int b) {
			//if you want to addition please use + operator 
			int c=a+b;
			return c;
		}
		
		//p,q and r are local variable 
		//Method type -non-static/instance method
		//method name -sub
		//No of parameter =2
		//data type of parameter = int 
		// what we are returning = int value 
		//If you want to call this method ---> main 
		// To call instance method we need obj
		public int Sub(int p, int q) {
			int r=p-q; //-10
			return r;
		}
		
		public int multi(int s,int t) {
			int g=s*t;
			return g;
		}

}

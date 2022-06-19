package operator;

public class UnaryOperator1 {
	public static void main(String[] args) {
		
		   UnaryOperator1 obj=new UnaryOperator1();
		  obj.Negative(-5); 
		  obj.Positive(-5); 
		  obj.Increment(25); 
		  obj.decrement(40);
		  obj.Boolean(true);
		 
		
		int var1=10;
		// ++var1; // please increase by 1 //var1=var1+1
		System.out.println(++var1); //addition and print the value
		//System.out.println(var1); //11
		System.out.println(var1++); //11 //addition and print the value
		System.out.println(var1++); //12
		System.out.println(var1);
		
		
		System.out.println(++var1 + var1++); // three addition + print 
		// ++var1 --> addition 14
		//var1++ --> print 14
		
		System.out.println(var1);
		
		
		int var2=10;
		System.out.println(--var2); // 9sub and print the value
		//System.out.println(var1); 
		System.out.println(var2--); //9 //addition and print the value
		System.out.println(var2); //8
		//System.out.println(var1);
		
		
	}

	
	private void Positive(int a) {
		System.out.println("I am operator to represent positive " + (+a));
	}
	
	private void Negative(int b) {
		System.out.println("I am operator to represent negative " + (-b));
	}
	
	private void Increment(int c) { //c=25+1  36
		//c=c+1   // it will increment by 1;
		System.out.println("I am operator to represent increment " + (++c));
	}
	
	private void decrement(int d) { 
		//d=d-1   //it will decrement by 1;
		System.out.println("I am operator to represent decrement " + (--d));
	}
	
	private void Boolean(boolean d) { 
		
		System.out.println("I am operator to represent boolean in reverse " + (!d));
	}
}

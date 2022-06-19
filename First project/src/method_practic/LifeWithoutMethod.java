package method_practic;

public class LifeWithoutMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeWithoutMethod.Addition(12,24);
		// Sum of two numbers program 
		int a=5;
		int b=10;
		int c=a+b; //
		System.out.println("Addition of two number" + c);
		// Now need to print sum of 25 and 35
		a=25;
		b=35;
		c=a+b;//
		System.out.println("Addition of two number" + c);///
		// If you see we have to repeat same line of code 
		//whenever we have to addition of two new number
		// So in such cases where some code is duplicate
		//we can put them in method 
		a=50;
		b=50;
		c=a+b;//
		System.out.println("Addition of two number" + c);///
		int d=c+5;
		System.out.println("d value" +d);
		a=125;
		b=100;
		c=a+b;//
		System.out.println("Addition of two number" + c);///
	}
	
	// These four line is duplicate so created one method with name 
	//Addition 
	public void Addition() {
		int a=5;
		int b=10;
		int c=a+b; //
		System.out.println("Addition of two number" + c);
		
	}
	
	public static void Addition(int a,int b)
	{    
		int d;
		d=a+b;
		System.out.println("addition is" +d);
	}
	// Method syntax 
	//<Access_Modifier> void <Identifier>(){
	           //Method Body
     //}
}

package method_practic;

public class SecondMethod {
public static void main(String[] args) {
		
		//What we need to do?
		// please add three number and minus 10 from the addition value
		
		//Create the SecondMethod class object to call method
		SecondMethod test=new SecondMethod();
		
		// Created Add method with three parameter to sum three numbers 
		int P=test.Add(40, 40, 40);
		// In above Add method will do sum and return the value 
		//which will be same in local variable P
		System.out.println(P); //120 Printing the value of P
		//Passing the sum (P) in another method Sub to minus the 10 
		int k=test.Sub(P);  //test.sub(120);
		//Substracted value is store in K 
		System.out.println("Final value is " + k);
	}
	//Access modifier-Public
		//Return Type -int
		//Method name-Add
		//Parameter-three parameter
	public int Add(int a,int b,int c) {
	// As return type of this method is int we need to add return statement
	// return the value int so we are doing the sum of three number 
	// and returing it 
		return (a+b+c);
	}
	//Access modifier-Public
	//Return Type -int
	//Method name-Sub
	//Parameter-one parameter
	public int Sub(int d) { //d=p=120
		
		// we are substracting 10 from sum of three numbers and printing it
		System.out.println(d-10);
		// As return type is int so returning the int value
		return (d-10);
	}
	//Access modifier-Public
	//Return Type -Void
		//Method name-Sub1
		//Parameter-one parameter
	public void Sub1(int s) {
		System.out.println(s-10);
	}
}

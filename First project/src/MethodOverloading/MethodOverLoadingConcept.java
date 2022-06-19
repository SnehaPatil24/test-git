package MethodOverloading;

public class MethodOverLoadingConcept {
	
	//Method Signature --Method Name +Parameter
	//Method OverLoading -where you have two or more methods with same name 
	//but different signature
	
	
	// Method Overloading 1 - By changing no of parameter
	
	//Access Modifier - Protected
	//Return Type- void
	//Method Name- Add
	//No of parameter-Zero
	//Method signature - Add()
	protected void Add() {
		
		System.out.println("I am add without parameter");
		
		
	}
	
	//Access Modifier - Protected
	//Return Type- void
	//Method Name- Add
	//No of parameter-one with int
	//Method Signature- Add(int k)
	protected void Add(int k) {
		System.out.println("I am add with single int parameter");
	}
	
	//Method Overloading 2- By changing the data type of parameter 
	//without changing no of parameter
	
	// In below method we change the data type from int to float
	
	//Access Modifier - Protected
	//Return Type- void
	//Method Name- Add
	//No of parameter-one with float
	//Method Signature- Add(float i)
	protected void Add(float i) {
		System.out.println("I am add with single float parameter");
	}
	
	
	
	//Method Overloading 3- By changing order of parameter
	// To apply change in order of parameter method should have minimum two parameter
	// Parameter should have different data type 
	
	//Access Modifier - Private (within the class only)
	//Return Type- void
	//Method Name- Add
	//No of parameter-Two one with int and another with float
	//Method Signature- Add(int a ,float b)
	private void Add(int a ,float b) { //Local variable
		System.out.println("I am add with first int and second float parameter");
	}
	
	//Here we are taking first parameter as float instead of int
	//Access Modifier - Private (within the class only)
	//Return Type- void
	//Method Name- Add
	//No of parameter-Two one with int and another with float
	//Method Signature- Add(float a ,int b)
	
	  private void Add(float a ,int b) {
	  System.out.println("I am add with first float and second int parameter");
	  
	  }
	 
	  public static void main(String[] args) { //local variable
			
			MethodOverLoadingConcept newname=new MethodOverLoadingConcept();
			newname.Add();//add without parameter
			newname.Add(5.5f); //add with single float parameter
			newname.Add(45.5f, 3); //add with first float and second int parameter
			//compile time method binding 
			newname.main(45);
			
		}
	
	
	//You can have multiple main methods if your signature is different
	public static void main(int a) {
		System.out.println(a);
		
	}
}

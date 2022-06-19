package MethodOverloading;
//overloaded methods ---Addition method is overloaded method

//METHOD OVERLOADING - 
//It is concept in which you have same method name but different signature 
		
//What is signature - It is combination of method name and parameter
		
//How many you can do method overloading?
		//Three ways 
			// A. No of parameter
			// B. Change the data type of parameter
			//C change the order of parameter

public class MethodOverloadingExample {
	
	public static void main(String[] args) {
		MethodOverloadingExample test=new MethodOverloadingExample();
		test.Addition();//method binding happens compile
		test.Addition(1);//single parameter

	}
	
	
	//APPROACH 1- Method overloading concept through no of parameter is different
	
	//ACCESS MODIFIER-PUBLIC
	//RETURN TYPE-VOID
	//METHOD NAME=ADDITION
	//NO OF PARAMETER =0
	public void Addition() {
		
		System.out.println("No Parameter");
		
	}
	//ACCESS MODIFIER-PUBLIC
	//RETURN TYPE-VOID
	//METHOD NAME=ADDITION
	//NO OF PARAMETER =1
	//Data type of parameter -int
	public void Addition(int a) {
		System.out.println("I am overlaoded method as i have one parameter");
	}

	//APPROACH 2- Method overloading concept through datatype of parameter is different
	
	
	//ACCESS MODIFIER-PUBLIC
	//RETURN TYPE-VOID
	//METHOD NAME=ADDITION
	//NO OF PARAMETER =1
	//Data type of parameter -double
	public void Addition(double a) {
			System.out.println("I am overlaoded method as though i have single parameter but my parameter data type is double");
		}
	
	//APPROACH 3- Method overloading concept by changing order of parameter
		
	//ACCESS MODIFIER-PUBLIC
	//RETURN TYPE-VOID
	//METHOD NAME=ADDITION
	//NO OF PARAMETER =2
	//Data type of parameter -first one is double and second is int
	
	public void Addition(double a,int b) {
				
			}

		//ACCESS MODIFIER-PUBLIC
		//RETURN TYPE-VOID
		//METHOD NAME=ADDITION
		//NO OF PARAMETER =2
		//Data type of parameter -first is int and second is double
		public void Addition(int a,double b) {
						
		}
		
		// Below method is not overlaoded method as we have only one method with name M1
		public void M1() {
			
		}
		//Addition(int a,double b)--->Signature 
		//when two or more methods is having same name but 
		//different signature 
		

}
	


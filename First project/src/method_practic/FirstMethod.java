package method_practic;

public class FirstMethod {
	//Instance Variable
			int a ;

			public static void main(String[] args) {
			    // Created the object of class FirstMethod to call instance variable and method
				FirstMethod obj=new FirstMethod();
				//Called the instance variable , it will print default value of a
				System.out.println(obj.a); //0
				//int b =obj.a; //Assign the value of a to local variable b
				
				// Method Calling 
				//To call the method we need to call by object like below
				obj.Addition(); //Addition method 
				//After Addition, it will come back to main method and execute next line
				System.out.println("I am back to main ");	
				//It will call M1 method
				obj.M1();
				//After M1 method execution below statement will be print
				System.out.println("I am back to main ");	
				//It will call M2 method
				obj.M2();
				//calling add method multiple times 	
				obj.add(5, 10);
				obj.add(25, 35);
				obj.add(50,50);
				obj.add(125, 100);
				//obj.add();
			}
			
			//Syntax for Method 
			
			//access_modifier data_type MethodName(){
			
					//Method body 
			
			//}
			
			
			
			
			// Addition method without parameter and not returning any value return type
			// Return type is void -it means it will not return any value
			public void Addition() {
				System.out.println("I am Addition");
			}
			
			// M1 is method without parameter and not returning any value
			//Access modifier-Private
			//Return Type -Void
			//Method name-M1
			//Parameter-zero
			private void M1() {
				System.out.println("I am M1");
			}
			//Access modifier-Protected
			//Return Type -Void
			//Method name-M2
			//Parameter-zero
			protected void M2() {
				System.out.println("I am M2");
				FirstMethod newobj=new FirstMethod();
				newobj.add(4, 10);
				
			}
			
			//Access modifier-Public
			//Return Type -Void
			//Method name-add
			//Parameter-two parameter
			
			// Add Method with two parameter and no return type
			public void add(int a, int b) {// variable declaration 
				System.out.println(a+b);
			}
			//Access modifier-Public
			//Return Type -Void
			//Method name-M3
			//Parameter-one parameter
			public void M3(float b) {
				
			}
			//Access modifier-Public
			//Return Type -Void
			//Method name-M4
			//Parameter-three parameter
			public void M4(int a, float b ,boolean c) {
				
			}
}

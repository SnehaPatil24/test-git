package ForLoop;

public class forloop {
	// Example we need to do School -Registration flow 
		// Total student registration -50
		// On registration assign roll + Welcome kit 
		// Logic will like below  
		//int RollNo =1 
		// RollNo<=50
		// Previous Roll No +1
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//for(initialization;Condition,increment)
			for (int RollNo=1;RollNo<=50;RollNo++) {
				System.out.println("Your Roll No is"+ RollNo);
				System.out.println("Welcome to School");
			}
			System.out.println("Registration is closed --All seats are filled");

			//Condition 1 - All the criteria are not mandatory in for loop
			
			/*
			 * for (;;) { System.out.println("I am not going to stop"); }
			 *
			 *for (rollno=1;;rollno++) {
				}
			 *
			 *
			 *
			 */
			
			//condition 2 :- Initialization can happen outside- NO 
			//only declaration can happen outside
			
			// declare - datatype variablename
			int rollno=1;
			//Initialization variable=50 
			for(rollno=1;rollno<=50;rollno++) { //rollno=rollno+1
				
			}
			
			//Condition 4-- Increment/decrement can be done by any value
			//Print all even number from 2 to 100
			for(int a=2;a<=100;a=a+2) {
				System.out.println("I am a " + a);
			}
			 
			//condition 5- Decrement means you can print in reverse order
			//print from 10 to 1 
			for(int a=10;a>=1;a=a-1) { //a--
				System.out.println("Reverse number" + a);
			}
			
			//condition 6- If i write increment ++/-- before variable
			// Nothing is going to change-as after condition statement will run
			// so increment will happen as last
			for (int a=4;a<=10;++a) {
				System.out.println("This is something different" + a);
			}
			
			//condition 7- Increment in for loop instead of in for loop
			for (int a=4;a<=10;) {
				
				System.out.println("Increment in for loop "+ a);
				a=a+1;
				
			}
			
			//0-1
			//condition 8 - printing negative value
			for(int a=10;a>=-2;a--) {
				System.out.println("Printing value till we get negative " + a);
			}
			
			//condition 9- Taking char as variable
			//It will take ascii value of character will checking condition a=97
			for (char a='a'; a<=100; a++) {
				System.out.println("I am character "+ a);
			}
		}
}

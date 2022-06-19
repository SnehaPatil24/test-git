package If_condition;

public class IfElseClass {

	public static int age=18;

	public static void main(String[] args) {
		
		
		//>= ---Relational Operator --output will be always true/false
		// 18>=18 ---true
		//if(true){
		// execute if condition statements
		// }
		
		/*
		 * if condition syntax 
		 * if(condition){ 
		 *   //this part of statement will execute if condition is true
		 * }
		 */
		
		/* if condition execution flow
		 * 1. It will execute the condition , if output is true  Age>=18
		 * 2. if condition is true, It will execute all the statements inside if block 
		 * 3. then it will execute else block
		 * 4. else condition will execute by default if condition is false 
		 */
		if(Ifcondition.age>=18) { 
			System.out.println("Age is more than 18, Sign up sucessful");
		}else {
			System.out.println("Age is less than 18 , you can't sign up");
		}
		
		System.out.println(" I am not part of if so i will execute everytime");

	}


}

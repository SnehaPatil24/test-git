package WhileLoop_DoWhie;

public class WhileCondition {
	public static void main(String[] args) {
		WhileCondition test=new WhileCondition();
		int var =10;
		
		while(var<=100) { // 10<=100 ; 30<=100 50<=100 70<=100 90<=100
			
			System.out.println("I am in while loop " +var);
			var=test.add(var); //10 30
		}
		//syntax of while - You don't have initilization/increment like for loop
		//it will have only condition part
		/*
		 * While(condition) { 
		 * 
		 * //if condition is true then run the loop else go out of it
		 * }
		 */
	}

	public int add(int a) {
		return a+20; //30 50
	}

}

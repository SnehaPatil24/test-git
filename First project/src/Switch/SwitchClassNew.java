package Switch;

public class SwitchClassNew {
	public static int marks=90;
	public static int actualmarks=80;

	public static void main(String[] args) {
	
		//If condition allows two variable comparison 
		if(marks==actualmarks) {
			System.out.println("You got highest marks");
		}
		
		
		//Condition 1 :- Switch expression don't allow boolean 
		
		//Trying to put above condition in switch expression, it will throw error
		//// expression not allow relational operator as it return boolean value
		//switch(marks==actualmarks) {
		
	   //Condition 2 :- constant only allow constants/literal
		//if we try to use variable we will get compilation error
		//case actualmarks:
		//}	
		
		
		
		//Condition 3:- You can have duplicate if condition like below but switch doesn't allow 
		// duplicate case 
		
		//If condition having same condition
		if(marks==80) {
					System.out.println("You got highest marks");
		}else if(marks==80) {
			
		}

		//Switch will give compiler error if we try to put
		switch (marks) {
		
		case 80:
		
		// You cann't have duplicate case if you put you will get compilation error	
		//case 80:
			
		
		}
	
		//condition 4- switch expression and case data type should be same
				
		if(true) {
			System.out.println("I am true value");
		}
		
		//you case data type should be same as your switch expression
		switch(2/2) {  //1 data type int
		
		//case true: //case should be int
			
		}
		
	}
}

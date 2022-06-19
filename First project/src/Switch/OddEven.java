package Switch;

public class OddEven {
public static void main(String[] args) {
		
		int var=45;
		
		//Checking whether number is odd or even through if loop
		if(var%2==0) { //true or false 
			System.out.println("I am even number");
		} else {
			System.out.println("I am odd number");
		}
		
		//Calculating odd even number through switch
		
		//switch expression doesn't support boolean  
		//but switch support int 
		
		
		/*
		 * Switch syntax
		 * 
		 * switch(expression) {
		 * 
		 * case 1:
		 * 
		 * case 2:
		 * 
		 * default :
		 * }
		 */
		
		switch(var%2) {  //expression will calculate the reminder
		
		//In first case it will check whether reminder is equal to zero
		case 0 :
			System.out.println("I am even number");
			break;
		//If first is not true/not executed , it will check for this case
		case 1 :
			System.out.println("I am odd number");
		
		}
			

	}
}

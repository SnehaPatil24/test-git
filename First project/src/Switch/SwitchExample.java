package Switch;

public class SwitchExample {
	public static void main(String[] args) {
		
		
		//Checking whether char is vowel or not using if loop
		char test='i'; // taking one character 
		
		//If character is any one of them (a,e,i,o or u ) then it is vowel
		//Keeping if loop with OR condition , you can keep them in multiple if else condition
		if(test=='a' ||test=='e' || test=='i' ||test=='o' || test=='u') 
			System.out.println("I am vowel " + test);
		 else {
			System.out.println("I am not vowel ");
		}
		
		 
		//Checking whether char is vowel or not using switch loop
		
		switch(test) {
		
		
		//It will execute first case test=='a' if true it will run statement
		//inside 1st case else will go to case 2
		case 'a':
			System.out.println("a");
			break; //break is used to know compiler where to end the 1st case execution
		
		//It will execute second case test=='e' if above case is false
		//if test=='e' then statement inside case run else will go to next case
		case 'e' :
			System.out.println("e");
		
		//It will execute  case test=='i' if above case is false
		//if test=='i' then statement inside case run else will go to next case
		case 'i' :
			System.out.println("i");
			break;
		//It will execute  case test=='o' if above case is false
		//if test=='o' then statement inside case run else will go to next case
		
		case 'o' :
			System.out.println("o");
		//It will execute case test=='u' if above case is false
		//if test=='u' then statement inside case run else will go to next case
		case 'u' :
			System.out.println("u");
		//if all cases are false then it will run default
		// it is similar to else condition
		default : 
		System.out.println("It is not vowel");
		
		}
	}

}

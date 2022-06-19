package Switch;

public class SwitchCondition {
public static void main(String[] args) {
		
		int marks=70;
		int actualmark=80;
		
		
		  // You cannot use the boolean 
		switch(marks) {
		  
		  //marks==90 
		case 90 :
			System.out.println("My marks is 90");
			break;
		  //marks==70 
		case 70 :
		System.out.println("My marks is 70");
		break;
		  //marks==80 
		case 80 :
			System.out.println("My marks is 80");
			break;
			//default is similar to else condition
			//It is also not mandatory to write 
		default :
			System.out.println("I am else condition");
		  }
		 
		
		
		if (marks == actualmark) { //90==80 false
			System.out.println("My marks is 90");
		} else if (marks == 70) {
			System.out.println("My marks is 70");
		} else if (marks == 80) {
			System.out.println("My marks is 80");

		} else {
			System.out.println("I am from else ");
		}

	}

}

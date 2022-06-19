package Switch;

public class SwitchOperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int var=1;
		 	
		
		switch(var%2) {  //you can't use the boolean operator in switch
						//Relational operator returns boolean value so we can't use in switch
						// Case always have either constant or literal
		
		case 1:   // Case always have either constant or literal
			System.out.println("January");
			break;
		case 2: 
			System.out.println("Feb");
			break;
		case 3 : 
			System.out.println("Mar");
			break;
		default:
			System.out.println("Please put the value between 1 to 12");
		}
		
		

	}

}

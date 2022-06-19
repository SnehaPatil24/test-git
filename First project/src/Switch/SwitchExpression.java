package Switch;

public class SwitchExpression {
	public static void main(String[] args) {
		// To check whether number is odd or even 
		
		int xyz=12;
		
		// xyz%2== 0  even 
		
		switch(xyz%2) { //if (xyx%2==0)  boolean
		
		case 0 :
			System.out.println("This is even number");
		     break;
		default :
			System.out.println("This is odd number");
		
		}

	}

}

package operator;

public class RelationalOperator {
	// Relational operator only return true or false value
		// These operator check relation between two value like greater than , less than 
		int a=5;
		int b=5;
		

		public static void main(String[] args) {
			RelationalOperator obj=new RelationalOperator();
			
			// To find whether both variable is having same value
			// we need to use == (equality operation)
			// It will return either true or false value
			System.out.println("Check whether a is equal to b "+ (obj.a==obj.b));// where a and b is having same value
			
			// You cannot use single = to check equality as it is assignment operator 
			
			//Checking whether a is greater than b  5>5--false
			System.out.println("Check whether a is greater than b " + (obj.a>obj.b));
			
			//Checking whether a is less than b  5<5--false
			System.out.println("Check whether a is less than b " + (obj.a<obj.b));
			
			//Checking whether a is greater than or equal to b  5>=5--true
			System.out.println("Check whether a greater than or equal to b " + (obj.a>=obj.b));
			
			//Checking whether a is less than or equal to b  5<=5--true
			System.out.println("Check whether a less than or equal to b " + (obj.a<=obj.b));
			
			
			//Checking whether a is not equal to b  5!=5 false
			System.out.println("Check whether a is not equal to b " + (obj.a!=obj.b));
			
			// = ---assignment operator - it will assign value
			//== ---equality operator -- it will check whether both value are equal 
			//!= --- not equality operator -- it will check whether both value are not equal 
					
		}
}

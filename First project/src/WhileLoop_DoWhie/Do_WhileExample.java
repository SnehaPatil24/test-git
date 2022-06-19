package WhileLoop_DoWhie;

public class Do_WhileExample {
public static void main(String[] args) {
		
		boolean var=false ;
		
		// While will execute only when condition is true 
		//Below while will not execute as condition is false 
		while(var) {
			System.out.println("I am in while loop");
		}
		System.out.println("I am outside while loop");
		
		
		// Do while
		// within do while minimum one iteration will always get execute
		//Do while -first do the execution and then check the condition
		
		do {
			System.out.println("I am in do while loop");
		} while(var);
		
		
		// print till interation 10
		int j=1;
		do {
			System.out.println("I am in do while loop" +j);
			j=j+1;
		} while(j<10);
		
		
		/*boolean var1=true ;
		
		// While will execute only when condition is true 
		//Execute below while till no of iteration is 10
		int i=1;
		while(var1) {
			System.out.println("I am in while loop");
			System.out.println(i);
			i=i+1;
			if(i==10) {
				var1=false;
			}
		}
		System.out.println("I am outside while loop");*/
	}
		
}

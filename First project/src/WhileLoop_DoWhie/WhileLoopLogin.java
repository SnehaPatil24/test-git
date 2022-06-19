package WhileLoop_DoWhie;
//We need to keep trying different user name and password till
//we are able to login gmail
public class WhileLoopLogin {
	static boolean loginsuccessful=false ;
	static int i=1;//local variable
	public static void main(String[] args) {
		
		//While syntax
		
		/*
		 * while(condition) {
		 * 
		 * }
		 */

		while(!loginsuccessful) {
			System.out.println("I am trying for another username");
			System.out.println("I am trying for another password");
			System.out.println("Trying to login");
			//if(HomeScreen is visible){
				//loginsuccessful=true;
			//}
			i++;
			System.out.println(i);
			if (i==10) {
				loginsuccessful=true;
			}
			
		}
	}
}

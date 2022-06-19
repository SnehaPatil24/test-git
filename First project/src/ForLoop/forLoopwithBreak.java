package ForLoop;

public class forLoopwithBreak {
	public static void main(String[] args) {
		
		// i need to execute till 10 interation
		//but if my value is 5 then stop the iteration
		
		for (int i=1;i<=10;i++) {
			//break will skip all the remaining iteration
			if(i==5) { //1<=5
				break;
			}
			System.out.println("I am iteration " +i);
		}
		System.out.println("I am outside the for loop");
	}
}

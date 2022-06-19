package ForLoop;

public class forloopwithcontinue {
	public static void main(String[] args) {
		for (int i=1;i<=10;i++) {
			//continue will only skip current iteration 
			//but remaining iteration will continue
			if(i==5) { //1<=5
				continue;
			}
			System.out.println("I am iteration " +i);
		}
		System.out.println("I am outside the for loop");
	}

}

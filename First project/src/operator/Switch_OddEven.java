package operator;

public class Switch_OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		if(a%2==0)// if condition gives boolean o/p
		{ 
			System.out.println("NO. IS EVEN ");
		}
		else
		{
			System.out.println("NO. IS ODD ");
		}
		switch(a%2)//== condition not checked
		{
		case 0:
			System.out.println("I am even");
			break;
		case 1:
			System.out.println("I am odd");
		
		}
	}

}

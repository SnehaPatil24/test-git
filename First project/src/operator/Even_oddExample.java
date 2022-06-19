package operator;

public class Even_oddExample {
     
	public static int var;
	public static void main(String[] args) {
		Even_oddExample.var=10;
		Even_oddExample obj=new Even_oddExample();
		obj.OddEven(8);
		/*if(var%2==0) {
			System.out.println("number is EVEN " +var);
		}
		else
		{
			System.out.println("number id ODD "+var);
		}*/
	}
	//method type---2
	private void OddEven(int a)
	{
		if(a%2==0) {
			System.out.println("NO. IS EVEN ");
		}
		else
		{
			System.out.println("NO. IS ODD ");
		}
	}
	
}

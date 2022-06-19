package Exception;

public class CatchSequence {

	public static void main(String[] args) {
		int []a= {10};
		/*try have multiple catch but sequence is matter 
		it should start from child to parent*/
		try
		{
			System.out.println(a[1]);
			
		}
		catch(NullPointerException e)//child
		{
			
		}
		catch(ArithmeticException p)//child
		{
			
		}catch(Exception h)//parent 
		{
			System.out.println("i am in exception");
		}

	}

}

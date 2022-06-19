package self_study;

public class stringReverse {
	public static void main(String[] args)

	{

		String str = "My String Output";
		// Get the String length
		int iStrLength = str.length();
		// Using While loop
		while (iStrLength > 0)
		{
			System.out.print(str.charAt(iStrLength - 1));
			iStrLength--;
		}
		System.out.println(" ");
		System.out.println("using for loop");
		String str1 = "sneha patil";
		String rev="";
		for(int i=str1.length()-1; i>=0;i--) 
		{
			rev=rev + str1.charAt(i);
			
		}
		System.out.println(rev);
	}
}

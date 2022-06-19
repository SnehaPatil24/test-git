package self_study;

public class palindrom_string {
	public static void main(String[] args) {
		
			
		String str="madam";
		String rev="";
		
		for(int i=str.length()-1; i>=0;i--) 
		{
			rev=rev + str.charAt(i);
			
		}
		if(str.equals(rev)) 
		{
			System.out.println(str + "is a paliondrome string");
		}
		else
		{
			System.out.println(str + " is not paliondrome string");
		}
		

	}

}

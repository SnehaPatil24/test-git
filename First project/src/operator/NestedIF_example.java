package operator;

public class NestedIF_example {
         public static int age;
         public static int wt;
	public static void main(String[] args) {
		age=23;
		wt=45;
		if(age>18)
		{
			System.out.println("stage 1 clear you are eligible for blood donation");
		       
			if(wt>50)
			{
				System.out.println("go for blood donation");
			}
			else
			{
				System.out.println("plz try next time as  you are under weight ");
			}
		}
		else {
			System.out.println("you are not eligible");
		}
		 

	}

}

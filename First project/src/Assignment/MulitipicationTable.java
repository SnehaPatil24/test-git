//2. Print the multiplication table of number
package Assignment;

public class MulitipicationTable {
   public static void main(String[] args) {
	
	int n=5;
	System.out.println("multiplication table of 5");
	for(int i=1;i<=10;i++)
	{
		int sum=n*i;
		System.out.println(+n+ " * " +i+ " =  " +sum);
	}

}
}

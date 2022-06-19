// Check the largest among the three numbers
package IfElse_Assignment;

public class Largest3 {
  public static void main(String[] args) {
	int num1=54;
	int num2=32;
	int num3=87;
	if(num1>num2 && num1>num3)
	{
		System.out.println(num1+ " is greater");
	}
	else if(num2>num1 && num2>num3)
	{
		System.out.println(num2+ " is greater");
	}
	else
	{
		System.out.println(num3+ " is greater");
	}
}
}

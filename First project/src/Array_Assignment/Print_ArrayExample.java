//3. Different ways to Print Array
package Array_Assignment;

import java.util.Arrays;

public class Print_ArrayExample {

	public static void main(String[] args) {
		//print using for loop
		int []a= {21,61,75,89,12,32,65};
		System.out.println("print using for loop ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println("");
		//print using for each loop
		int []b= {1,6,5,8,2,3,9};
		System.out.println("print using for each loop ");
		for(int arr:b)
		{
			System.out.print(arr+",");
		}
		System.out.println(" ");
		//print using  toString() method
		int []array= {21,61,75,89,12,32,65};
		System.out.println("print using  toString() method");
		System.out.println(Arrays.toString(array));
		
		
		//print using for while loop
		int []b1= {1,6,5,8,2,3,9};
		System.out.println("print using while loop ");
		int j=0;
		while(j <b1.length)
		{
			System.out.print(b[j]+",");
			j++;
		}
	}
	

}

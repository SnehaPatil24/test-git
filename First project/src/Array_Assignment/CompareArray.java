//7 Compare Two Arrays in Java
package Array_Assignment;

import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {
		
		int []array1=new int[] {1,2,3,4,5};
		int []array2=new int[] {1,2,3,4,5};
		
		if (Arrays.equals(array1,array2))
		{
			System.out.println("Arrays are equal.");   
		}	
		else
		{	
			System.out.println("Arrays are not equal.");   
		
		}   	
		
		 int arr1[] = {10,20,30,40,50};
		    int arr2[] = arr1;//{10,20,30,40,50};
		    int arr3[] = {15,25,35,45,55};
		    int arr4[] = {15,25,35,45,55};
		    
		    // compare arrays using == operator
		    // compare arr1 and arr2
		    if(arr1 == arr2)
		      System.out.println("arr1 & arr2 are same");
		    else 
		      System.out.println("arr1 & arr2 are not same");
		    
		    // compare arr1 and arr3
		    if(arr1 == arr3)
		      System.out.println("arr1 & arr3 are same");
		    else 
		      System.out.println("arr1 & arr3 are not same");
		    
		    // compare arr1 and arr4
		    if(arr1 == arr4)
		      System.out.println("arr1 & arr4 are same");
		    else 
		      System.out.println("arr1 & arr4 are not same");
			
	}
}	
	 

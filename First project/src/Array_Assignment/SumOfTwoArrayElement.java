//6. Sum of Two Arrays Elements
package Array_Assignment;

import java.util.Arrays;


public class SumOfTwoArrayElement {
	 public static void main(String[] args) {

		 int array1[] = {2,3,4,5,6,7};
		    int array2[] = {2,3,4,5,6,7};
		    int array3[]= new int[6];

		    // both array must have same number of elements
		    if(array1.length != array2.length) {
		      System.out.println("Both array must have "+"same number of elements");
		      return; 
		    }
		    System.out.println("Enter first array elements: ");
		    System.out.println(Arrays.toString(array1));

		    // take input for array2 elements
		    System.out.println("Enter second array elements: ");
		    System.out.println(Arrays.toString(array2));

		    // loop to iterate through the array
		    for (int i=0; i<array3.length; i++) {
		      // add array elements
		      array3[i] = array1[i] + array2[i];
		    }

		    // display the third array
		    System.out.println("Resultant Array: "+ Arrays.toString(array3));
		  }
}

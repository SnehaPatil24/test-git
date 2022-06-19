////6. Sum of Two Arrays Elements
package Array_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraySum {
	public static void main(String[] args) {

	   
        int []a= {1,2,3,4,5};
        int []b= {1,2,3,4,5};
        int array3[] = new int[5];
	    // both array must have same number of elements
	    if(a.length != b.length) {
	      System.out.println("Both array must have "+"same number of elements");
	      return; 
	    }
	    
	   System.out.println("first array elements: ");
	   System.out.println( Arrays.toString(a));
	  
	  System.out.println("second array elements: ");
	  System.out.println(Arrays.toString(b));
	  
	    for (int i=0; i<array3.length; i++) {
	      array3[i] = a[i] + b[i];
	    }
	    System.out.println("Resultant Array: " + Arrays.toString(array3));
	    
	  }
}

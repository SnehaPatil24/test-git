//10. Merge two sorted Arrays
package Array_Assignment;

import java.util.Arrays;

public class Merge2SortedArray {
      public static void main(String[] args) {
    	  int []a= {2,4,5,3,6};
    	  Arrays.sort(a);//sort first array
    	  System.out.println(Arrays.toString(a));
    	  
    	  int []b = {4,16,1,2,3,22};
    	  Arrays.sort(b);//sort second array
    	  System.out.println(Arrays.toString(b));
    	  
    	  int[]c = new int[a.length+b.length];
	      int count = 0;
	      
	      for(int i = 0; i < a.length; i++) { 
		         c[i] = a[i];
		         count++;
		      } 
		      for(int j = 0; j < b.length;j++) { 
		         c[count++] = b[j];
		      } 
		      Arrays.sort(c);
		      System.out.println(Arrays.toString(c));
		   } 
	}


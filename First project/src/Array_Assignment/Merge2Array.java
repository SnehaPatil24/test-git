//Merge 2 Arrays in Java
package Array_Assignment;

import java.util.Arrays;

public class Merge2Array {
	public static void main(String[] args) {
	      int[]a = {1,2,3,4};
	      int[]b = {4,16,1,2,3,22};
	      int[]c = new int[a.length+b.length];
	      int count = 0;
	      
	      for(int i = 0; i < a.length; i++) { 
	         c[i] = a[i];
	         count++;
	      } 
	     for(int j = 0; j < b.length;j++) { 
	         c[count++] = b[j];
	      } 
	     
	      System.out.println(Arrays.toString(c));
	   } 
}

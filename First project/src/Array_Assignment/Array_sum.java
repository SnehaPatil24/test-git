//4. Find the Sum of Array in Java
package Array_Assignment;

public class Array_sum {
    public static void main(String[] args) {
    	int []b= {1,6,5,8,2,3,9};
    	int sum=0;
    	for(int i=0;i<b.length;i++)
    	{
    		sum=sum+b[i];
    	}
    	System.out.println("sum of array is "+sum);
	}
}

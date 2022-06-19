//5. Find the average of an Array
package Array_Assignment;

public class Array_average {
	public static void main(String[] args) {
    	int []b= {1,6,5,8,2,3,9};
    	int sum=0;
    	float avg=0;
    	for(int i=0;i<b.length;i++)
    	{
    		sum=sum+b[i];
    		avg=sum/b.length;
    	}
    	System.out.println("avrage of array "+avg);
	}
}

// 14. How to Sort an Array in Java
package Array_Assignment;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] a = { 27, 14, 95, 53, 60};
		System.out.println("sort using Arrays.sort method");
		Arrays.sort(a);// sort first array
		System.out.println(Arrays.toString(a));
		
       int []b=new int[]{5,3,7,2,1,6,9};
       System.out.println("sort using temp variable ");
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				int temp=0;
				if(b[i]>b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
							
				}
			}
			System.out.print(b[i]+" ");
		}
	}
}

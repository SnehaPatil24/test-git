//Reverse an Array in Java
package Array_Assignment;

import java.util.Arrays;

public class ReverseArray {
	 public static void main(String[] args) {
			int []a=new int[]{5,3,7,2,1,6,9};
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					int temp=0;
					if(a[i]<a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
								
					}
				}
				System.out.print(a[i]+" ");
			}
			//System.out.println(Arrays.toString(a));
			System.out.println("==========================");
			int []b= {9,4,3,2,1};
			for(int i=b.length-1;i>=0;i--)
			{
				System.out.print(b[i]+" ");
			}
			
	}
}

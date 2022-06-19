package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_InbulidMethod {

	public static void main(String[] args) {
		int []a= {2,4,5,3,6};
		//array is in build class which gives supporting for array
		System.out.println("value of array at index 0 before shorting  "+a[0]);
		 
		Arrays.sort(a);//this method will help to sort array
		System.out.println("value of array at index 0 after shorting  "+a[0]); 
	
		System.out.println(Arrays.toString(a));//it help to print array in one goal
		//length is final variable in arrays class which help to know size of array
		System.out.println("");
		System.out.println("length of array " +a.length);
		System.out.println("");
		//for loop print all value of array
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" a[i]= " +a[i]);
		}
		System.out.println("");
		System.out.println("--------using for each loop----------");
		for(int i:a) {
			//we are transferring each element of array into i one by one
			System.out.println(i);
		}
		System.out.println("");
		double [] p= {3.1, 2.2};
		System.out.println("length of array "+p.length);
		for(double j:p) {
			System.out.println(j);
		}
		System.out.println("");
		System.out.println("-------------------------------");
		int [] Rno=new int [40];
		for(int k=0;k<Rno.length;k++)
		{
			Rno[k]=k+1;
			System.out.println(Rno[k]);
		}
	}

}

//Copy Array in Java
package Array_Assignment;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Copy Array using forloop");
		int[] positiveNumbers = numbers; // copying arrays

		for (int number : positiveNumbers) 
		{
			System.out.print(number + ", ");
		}
		
		System.out.println("");
		
		System.out.println("Copy Array using copyof method");
		int[] a = Arrays.copyOf(numbers, numbers.length);
		/*
		 * for(int arr:a) { System.out.print(arr+ " , "); }
		 */
		System.out.println(Arrays.toString(a));

	}

}

package Array;

import java.util.Arrays;

public class School {
	// First approach --Register 50 student
	int roll1 = 1;
	int roll2 = 2;
	int roll3 = 3;// it will hold single value
	int roll4 = 4;
	// Array Declaration
	static int[] rollnumber; // this variable going to hold more than one value having data type as int
	static int[][][] twodimensional;
	// Array declaration and initialization happens in one line
	static int[] newrollnumber = { 1001, 1002, 1003, 1004, 1005 };// length =5

	// we need to use only one variable for all the values
	// all the data should be on same data type

	public static void main(String[] args) {
		// arrayname=new <datatype>[Size];
		// why new keyword for primitive data type
		// Types of data type --Primitive/Non-primitive
		rollnumber = new int[5];
		int var1 = 107;
		// rollnumber is array which only store object
		// but here are storing int value
		rollnumber[0] = var1;
		rollnumber[1] = 102; // 0+1=1
		rollnumber[2] = 103;// 1+1=2
		rollnumber[3] = 104;
		rollnumber[4] = 105;

		// Approach 1- Access specific array element by index

		System.out.println(rollnumber[3]); // 104

		// Approach 2- Access each and every element with hard-coded size

		for (int i = 0; i < 5; i++) {
			System.out.println("Access each and every elemet using for loop " + rollnumber[i]);
		}

		// Approach 3- Access each and every element

		System.out.println("Approach 3");

		for (int i = 0; i < rollnumber.length; i++) { // int i=0;i<5;i++
			System.out.println("Access each and every elemet using for loop with length " + rollnumber[i]);
		}

		// for initialization ;condition;increment/decrement
		// Approach 4:- Using for each loop
		System.out.println("-------For each loop for Array--------------------- ");
		// for each --> when you want to iterate through array for each and every
		// element
		// Array using index and it increase by 1
		// JVM say ok while iterating i will do increment by 1
		// Array indexing always start from zero
		for (int i : rollnumber) {
			System.out.println(i); // rollnumber[i] //rollnumber[0] //rollnumber[1]
		}

		System.out.println("-----ToString-----------");
		Arrays.parallelSort(rollnumber);
		System.out.println(Arrays.toString(rollnumber));

	}

}

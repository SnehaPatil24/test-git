package Array;

public class MultiDimensionalArray {
	// single dimensional array
	public static int[] arr;

	// 2-d array declaration
	public static int arr1[][];

	// 3-d array declaration
	public static int[][][] arr2;

	// 4-d array declaration
	public static int[][][][] arr3;

	// Two dimensional array having declaration and initialization in one line
	static int c[][] = { { 4, 5 }, { 5, 5 } };

	public static void main(String[] args) {

		// if your array is 2-D you need to provide size for both dimension
		// arr1=new int[2]; //if trying to provide size for one dimension then compiler
		// will throw error
		arr1 = new int[2][2];

		arr1[0][0] = 5; // initializing the array for [0][0] position
		arr1[0][1] = 15;
		arr1[1][0] = 25;
		arr1[1][1] = 35;
		// arr1[1][2]=45;

		for (int i = 0; i < 2; i++) { // first Iteration will start from i=0
			System.out.println(arr1[i][0]); // i value is replace in array arr1[0][0]
			System.out.println(arr1[i][1]); // arr1[0][1]

			// second iteration where i=1
			// arr1[1][0]
			// arr1[1][1]
		}

		// first iteration i=0
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) { // first iteration j=0
				System.out.println(arr1[i][j]); // arr1[0][0] //arr1[0][1]
			}
		}

		// This is how we generally write nested for loop
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
			}

			// print
			// *
			// * *
			// * * *

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

package Scanner_class;

import java.util.Scanner;

public class Scanner_example {
	public static void main(String[] args) {
		// Scanner is the class to help user to read data from console
		System.err.println("This is error");
		Scanner obj = new Scanner(System.in);
		int a = 0;
		// It will read the string from console
		System.out.println("Please enter the string");
		String test = obj.nextLine();
		System.out.println(test);
		System.out.println("Please enter the age of person");
		if (obj.hasNextInt()) {
			a = obj.nextInt();// we are trying to read the data fron console
		} // obj.nextShort(); //this method is used to read value short
		System.out.println("Printing the age");
		System.out.println(a);
		// Read the byte
		System.out.println("Please enter the value in byte");
		if (obj.hasNextByte()) {
			System.out.println(obj.nextByte());
		}
		// Read short
		System.out.println("Please enter the value in short");
		System.out.println(obj.nextShort());

	}

}

package MethodConcept;

import java.io.PrintStream;
import java.util.Properties;

import Array.MultiDimensionalArray;

public class SystemExample {
	// Below out variable is written in System class
	// Access Modifier -Public
	// Variable type - Static
	// Data Type -Non-primitive and which class it is representing PrintStream
	public static PrintStream out;
	// Below out1 variable is written by use in our class
	// Access Modifier -Public
	// Variable type - Static
	// Data Type -Non-primitive and which class it is representing
	// MultiDimensionalArray
	public static MultiDimensionalArray out1; // non-primitive data type

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SystemExample obj --- Reference/object declaration
		// =new SystemExample(); --Object initilization
		SystemExample obj;

		obj = new SystemExample(); // Declaration+Initilization

		System.out.println(SystemExample.out1);

		SystemExample.out1 = new MultiDimensionalArray();
		System.out.println(SystemExample.out1);
		// System.err.println("I am error ");
		// System.out.println()
		Properties prop = System.getProperties();
		// prop.list(System.out);
		System.out.println(System.getProperty("user.country"));
		if (System.getProperty("user.country") == "IN") {
			System.out.println("Currency is in Rupees ");
		}
		System.exit(1); // System.exit --- Nothing will run after this

	}
}

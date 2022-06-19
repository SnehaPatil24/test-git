package operator;

public class UnaryOperator {
	static int a = 45;
	static int b = -55;
	static int c = 95;

	public static void main(String[] args) {
		// To call static variable we don't need object

		// To represent positive value we use + sign infront of value
		System.out.println("Represent a as positive value " + (+UnaryOperator.a));

		// To represent negative value we use - sign infront of value
		System.out.println("Represent c as negative value " + (-UnaryOperator.c));

		// Mathematical rule - *- = + -3*-2=6
		// -+ - =- -3+-2=-5
		// To represent negative value as positive multiple it with - sign
		System.out.println("Represent negative b as positive value " + -(UnaryOperator.b)); // -(-45)

		// Please add 1 in variable a
		a = a + 1;// this is one approach a=45+1=46
		a++; // this will also add 1 --second approach a=46+1=47
		// ++ operator will only add 1
		System.out.println("After increment a value " + a);

		// If you have deduct 1 from variable
		a = a - 1; // first approach a=47-1=46
		a--; // second approach a=46-1=45
		System.out.println("After deduction a value " + a);

		a = 50;
		System.out.println("Value of a if postpix " + a++);// 50
		System.out.println(a);// 51

		System.out.println("Value of a if postpix " + a--);// 51
		System.out.println(a);// 50

	}
}

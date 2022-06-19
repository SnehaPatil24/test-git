package MethodConcept;

public class MultipleMethod_Call {

	// if i create instance/reference in class where it will allocate memory
	// public MethodDeclaration obj;

	// Total three method
	// static method -1 whose name is main
	// instance method- 2 whose name is m1 and m2
	// return type -void
	// return statement is mandatory -No as return type is void
	public static void main(String[] args) {
		// MethodDeclaration obj;
		// whenever you want to call instance method we need object of class
		MultipleMethod_Call obj = new MultipleMethod_Call();
		obj.M1();
		// whether object is require for static method -No
		// To call static method we need classname
		// Calling static method classname is not mandatory if you are calling
		// within the same class
		// m3();
		// Main is static method and with static method
		// we can't call instance method without object
		// M2();//

	}

	public void M1() {
		// If you are calling another instance method in any instance method
		// then object creation is not mandatory
		// you can call that method directly
		// M1 and M2 and instance method so due to which M1 can call M2 directly
		System.out.println("I am m1 method");
		M2();
		System.out.println("I am after m2");

	}

	public void M2() {
		System.out.println("I am M2 method");
	}

	public static void m3() {
		System.out.println("I am m3 method");
	}

}

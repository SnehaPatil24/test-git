package Inheritance;

public class PackageTwoClass extends PackageOneClass {
	
	public static void main(String[] args) {
		PackageTwoClass obj=new PackageTwoClass();
		
	}

	//Default constructor will be added in .class file if no constructor is avaiable 
	//It will super() method call for parent class constructor 
	
	public PackageTwoClass() {
		this(10);  //this will will same class constructor
		//super(); 
		//call to the another constructor should be on first line
		//either you can use this() or super but not both
		System.out.println("I am no parameter constructor");
		
		
	}
	//Calling the parent class is not mandatory it will be taken by 
	//compiler only if parent class has no parameter constructor
	public PackageTwoClass(int a) {
		super(1); //if not added will be added by compiler
		System.out.println("I am single parameter constructor");
		
	}
	//Calling the parent class is not mandatory it will be taken by 
	//compiler only if parent class has no parameter constructor
	public PackageTwoClass(int a,int b) {
		super(10); // User can give explicit call to parent class constructor
		System.out.println("I am two parameter constructor ");
	}
	
	//calling parent class constructor using super is not mandatory
	//only when parent class has no parameter constructor
	//But if parent class has only parameterized constructor then
	//you have to call the parent class explicitly else you will get 
	//compilation error 
	
	public void M5() {
		System.out.println("I am parent class M5");
	}
}
package Inheritance;

class ParentClass1{
	
	public int a;
	public int b; 
	
	/*
	 * public ParentClass() { System.out.println("I am parent class constructor"); }
	 */
	
	public ParentClass1(int b) {
		System.out.println("I am single parameter parent class constructor");
	}

	
	public ParentClass1(int b ,int c) {
		System.out.println("I am two parameter parent class constructor");
	}
}

//Sub-Class -ChildClass
//Super-Class- Parent Class
public class ChildClass1 extends ParentClass1{
	
	public int b;
	
	
	// If you don't write any constructor then compiler add one constructor 
	//that is nothing but default constructor
	
	// If you have parent-child relation and you create constructor/object of child class
	// then automatically parent class constructor will be called by compiler
	
	
	
	//This is no parameter constructor 
	//super()
	public ChildClass1() {
		//this - if you want me to call another constructor then write me on first line
		//super- if you want me to call parent class constructor then write me also on first line
		this(5); //this will be used to call another constructor from same class
				//super will be used to call super class constructor from child class
		
		System.out.println("I am no parameter constructor");
	}
	
	
	
	//by default compiler will only call no parameter parent constructor
	public ChildClass1(int a) {
		//super() // compiler has added super constructor here as childclass no parameter constructor has call to single parameter constructor 
		//parent class constructor with single parameter
		super(4); //As i have to call parent class single parameter then we have write explicitly 
		System.out.println("I am single parameter constructor");
	}
	
	//Constructor with two parameter
	
	public ChildClass1(int a , int b) {
		//super(); //parent class having no parameter constructor
		super(1);
		System.out.println("I am child class constructor with two parameter");
	}
	
	// Whenever you call childclass constructor it is mandatory to call parent class constructor
	// till now we are not calling parent constructor explicilty or compiler is not giving error
	// parent class was having no parameter constructor --compiler can call only no parameter parent class constructor
	public static void main(String[] args) {
		ChildClass1 obj1=new ChildClass1(5,10);
		ChildClass1 obj=new ChildClass1();//child class no parameter constructor 
		
	
	}
	
	
	public void M1(int b) {
		// if i have to refer local variable b ---b
		//if i have to refer instance variable of same class/child class this.b
		//if i have to refer instance variable of parent class then we used super.b
		super.b=b;
		this.b=b; // To diffieretiate between instance and local variable of same class
	     a=b; ///super.a=b;
	}
	
}
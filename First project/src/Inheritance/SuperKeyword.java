package Inheritance;

class Parent {
	
	int a ; //Non-static variable of Parent class
	
	//M1 method is instance method 	
	public void M1() {
		System.out.println("I am from Parent ");
	}
}


// SuperKeyword class is extending the Parent Class 
public class SuperKeyword extends Parent {
	
	int a; // Instance variable of child class 
	
	SuperKeyword(int a){
		this.a=a; //This keyword will call child class /current class instance variable
		super.a=a; //super keyword will call parent class instance variable
		super.M1(); // it will call parent class M1
		this.M1();// this will call child class M1
	}

	// Superkeyword class M1 method
	public void M1() {
		super.M1();
		System.out.println("I am from child ");
	}
	

	public void M2(int a) {
		M1();
		System.out.println("I am from child ");
	}
	
	public static void main(String[] args) {
		SuperKeyword obj=new SuperKeyword(5);

	}

}
package abstraction;
abstract class WhatMethodAbstractClassCanHave {
	
	//Abstract method can have instance variable
	int p;// variable declaration 
	
	//abstract class can have constructor 
	public WhatMethodAbstractClassCanHave() {
		System.out.println("I called by child to initialize my instance variable");
	}
	
	//A class can be abstract if you have abstract method
	 public abstract void P1();
	 
	 //A abstract class can have a normal method--method with implementatoon
	  public void P2() {
		 System.out.println("I am normal method but sadly in abstract class");
	 }
	  
	  // A abstract class can have static method 
	  
	  public static void P3() {
		  System.out.println("I am static method in abstract class");
	  }

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * WhatMethodAbstractClassCanHave.P3();
	 * 
	 * }
	 */


}

//Grandson is extending the class WhatMethodAbstractClassCanHave
public class GrandSon extends WhatMethodAbstractClassCanHave{
	
	public GrandSon() {
		//super();
		System.out.println("I am no parameter constructor from child class");
	}
	
	public void P1() {
		System.out.println("Finally P1 is implemented in child class");
	}
	
	public static void main(String[] args) {
		
		GrandSon obj=new GrandSon();
		obj.P1();
		obj.P2();
		obj.P3();
	}
	
}
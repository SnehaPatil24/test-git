package MethodOverloading;

public class CallingFromAnotherClass {
	/*
	  This is class is created to call the methods from another class
	 */
	
     public static void main(String[] args) {
    	// Whenever we have to call method we have to either create object
 		//or class by class name depends upon type of method
 		
 		/*Calling static Addition method of class AddWithoutMethodOVerloading 
 		 * within the class CallingFromAnotherClass
 		 */
		int c=AddwithoutmethodOverloading.add1(12, 43);
		System.out.println(c);
		
		// Creating object of class 
		AddwithoutmethodOverloading obj=new AddwithoutmethodOverloading();
		/*  Calling instance method Add of class AddWithoutMethodOVerloading
		within the class CallingFromAnotherClass*/
		obj.add2(45.5,85.0);
		CallingFromAnotherClass.Add1(12, 13);
	}
	 static int Add1(int a,int b)
	    {
		  System.out.println("calling from another class");
	    	 int c=a+b;
	    	 return c;
	    }
}

package overriding;

import Inheritance.greatgrandfather;

//Method Overriding 
//Rule 1- There should be parent child relation- in this Parent class is extended by ChildClassOveriding
//Rule 2- Method signature should be same in this method signature is same in child class
//Rule 3- Access modifier should be same or not be more restrictive in this Taste has access modifier private then in child class it can be private or more accessible than private 
//Rule 4 - If return type is non-primitive then return type will be same class or its child class (Covirant)

class Parent12 {
	
	// Method Name- Land
	// Access modifier -public
	//return type - void
	// To override this method in child everything should be same	
	public void Land() {
		System.out.println("I will build shop for monthly income");
	}
	
	// Method Name- bankbalance
	// Access modifier -public
	//return type - int
	// To override this method in child everything should be same
	public int bankbalance() {
		
	System.out.println("I will give some money to charity ");
	    return 1;
	}
	
	//Non-primitive-You are referring the class object
	//Access_Modifier Return_Type Methodname()

	// Method Name- RelationWithRelative
	// Access modifier -public
	//return type - greatgrandfather
	// To override this method in child everything should be same
	// Or while overriding you can change the return type to greatgrandfather child class
	public greatgrandfather RelationWithRelative() {
		System.out.println("We only go when there is some family function");
		greatgrandfather obj=new greatgrandfather();
		return obj;
	}
	// Method Name- M2
	// Access modifier -protected
	//return type - void
	// To override this method in child everything should be same
	// While overriding access modifier can be change to public also as
	//Access -- private--->default--->protected--->public
	protected void M2() {
		System.out.println("I am from parent");
	}
	// Method Name- M3
	// Access modifier -private
	//return type - void
	// This is private method so it will not be visible to child class
	//so it will not take part in overriding
	private void M3() {
		System.out.println("I am from parent");
	}
}



public class ChildClassOveriding extends Parent12 {

	//Rule 1- Method overriding happens in parent child relation
	//Rule 2- Method signature should same ---MethodName +Parameter
	
	//This method is override by child class
	public void Land() {
		System.out.println("I will build home here");
	}
	
	//Rule 3 - If you want to override method and it has primitive return type
	// then while override it should be same
	// if you don't keep same return type you will get compilation error 
	/*
	 * public void bankbalance() { }
	 */
	
	 public int bankbalance(){
		 System.out.println("I need to build home so lets drop the plan of charity");
		 return 1545;
	 }
	 
	 //Method override having non-primitive return type
	 
	 // primitive -- it should same 
	 // Non-primitive--it should same return as parent class method or child class of return class
	 public greatgrandfather RelationWithRelative() {
		 System.out.println("I started business with them so generally i go daily");
			greatgrandfather test=new greatgrandfather();
			return test;
		 
	 }
	
	 // M3 is private in parent class so M3 in child is not override
	 public int M3() {
			System.out.println("I am from child");
			return 1;
	}
	 
	 //overide in child with changing the access modifier to public than protected 
	  public void M2() {
			System.out.println("I am from child");
		}
	  
	public static void main(String[] args) {
		
		ChildClassOveriding ref=new ChildClassOveriding();
		//if your reference/object name is pointing to child class object 
		// and you have method override then preference will be given to 
		//child class method
		ref.Land();
	}

}
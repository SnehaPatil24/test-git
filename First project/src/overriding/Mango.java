package overriding;
//Method Overriding 
//Rule 1- There should be parent child relation- in this Tree class is extended by Mango
//Rule 2- Method signature should be same in this Taste method signature is same in child class
//Rule 3- Access modifier should be same or not be more restrictive in this Taste has access modifier private then in child class it can be private or more accessible than private 
//Rule 4 - If return type is non-primitive then return type will be same class or its child class (Covirant)
class Tree {
	
	private Parent3 Taste() { 
		// Taste is method
		// Access modifier -public
		//return type - Parent
		
		Parent3 obj=new Parent3();//Parent class object is created
		return obj;
	}
	
	
	public int Primitive() {
		
		int var=10;
		return var;
	}
	
	// Normal method Syntax
	//<Access_Modifier> <Return_Type> <Identifier>()
	//Primitive return type
	//<Access_Modifier> <boolean OR char OR int .....> <Identifier>()
	// Non-Primitive return type
	//<Access_Modifier> <Class> <Identifier>()
	
}

public class Mango extends Tree {
	
	//Override -Taste 
	//Mango class is overriding the Taste method 
	//Access modifieris more accessible modifier than parent class
	//Return type should be same as parent class or child class here return type is child class
	//Method signature is same 
	public Child Taste(){
		Child obj=new Child();//Parent class object is created
		return obj;
		
	}
	
	// Primitive return type should be exactly same
	//Non-Primitive return type -same class  or sub-class
	// same class or Parent class
	
	
}
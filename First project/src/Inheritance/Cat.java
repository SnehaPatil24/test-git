package Inheritance;

//This program is to explain when super() is mandatory to call
//Parent class(NewAnimal) is having only one constructor but having single parameter
//in this case compiler can't add default super() call 
class NewAnimal {
	
	int a;
	//Constructor with single parameter
	  NewAnimal(int a){ 
		  this.a=10;
	  System.out.println("I am NewAnimal class constructor");
	  
	  }
	  
	public void eat() {
		System.out.println("I am eating");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//Dog class is extending the NewAnimal class
//Dog is subclass and NewAnimal is parent class
public class Cat extends NewAnimal{
	
	//No parameter constructor
	  Cat(){ 
		  super(45); //super keyword is similar to this() only difference it called parent class constructor 
	  //Adding super is mandatory in this case as parent class is not having no parameter constructor  
		  System.out.println("I am from Dog class");
   }
	
	  //Both this() and super() should be on first line when you call in constructor 
	 //so either you can use this() or super() but not both in one constructor 
	  Cat(int a){
	// Now explicitly calling super is mandatory because you only have single parameter constructor in parent /
	  super(45435); 
	  this.a=a; 
	  }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog ptr=new Dog();//No parameter constructor
		System.out.println(ptr.a);

	}

}
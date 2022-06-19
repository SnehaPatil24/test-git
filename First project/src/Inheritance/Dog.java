package Inheritance;
//This program is to explain when super() is not mandatory to call
//Parent class(Animal) is having only one constructor without parameter
//in this case compiler  add by default super() call after compilation so you don't need to add it 
class Animal {
	
	int a;
	 // Parent class constructor without parameter
	  Animal(){ 
		  this.a=10;
	  System.out.println("I am animal class constructor");
	  
	  }
	  
	public void eat() {
		System.out.println("I am eating");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//Dog class is extending the Animal class
//Dog is subclass and Animal is parent class
public class Dog extends Animal{ 
	//inheritance is a type is-a relationship
	
	  Dog(){ 
		//here super() will be added by java by default if you have no parameter constructor in parent class 
	   //super keyword is similar to this() only difference it called parent class constructor 
	    System.out.println("I am from Dog class");
    }
	
	  //Both this() and super() should be on first line when you call in constructor 
	 //so either you can use this() or super() but not both in one constructor 
	  Dog(int a){
	  //here super() will be added by java by default if you have no parameter constructor in parent class 
	 //super() is not mandatory to add if you have no parameter constructor in parent class or no constructor at all 
	    this.a=a; 
	  }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog ptr=new Dog();//No parameter constructor
		System.out.println(ptr.a);

	}

}
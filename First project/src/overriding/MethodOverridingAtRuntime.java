package overriding;
// Below is example of why method overriding is called as run time polymorphism 
//It is because when instance method is called it depends upon the obj is refer to which class object 
public class MethodOverridingAtRuntime {


public void add(int a ,int b) {
	 System.out.println("I am from parent " + (a+b));
}

public static void main(String[] args) {
	 
	  }

}


class childClass extends MethodOverridingAtRuntime {
	
	 public void add(int a ,int b) {
		 System.out.println("I am from Child " + (a+b));
	 }
	 
	 public static void main(String[] args) {
		 
		 // obj is child class reference and referring to child class object 
		 childClass obj=new childClass();
		 //obj is referring to child class object then it will call add method of child class
		 obj.add(4, 5);
		// obj1 is PArent class reference and referring to Parent class object
		 MethodOverridingAtRuntime obj1=new MethodOverridingAtRuntime();
		//obj1 is referring to PArent class object then it will call add method of PArent class
		obj1.add(5, 6);
		// obj2 is PArent class reference and referring to child class object
		 MethodOverridingAtRuntime obj2=new childClass();
		//obj2 is referring to child class object then it will call add method of child class though reference of parent class
		 obj2.add(6, 7); //
		// childClass obj3=new MethodOverridingAtRuntime();
		 
		 
	 }

	
}
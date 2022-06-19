package overriding;

//Method Hiding concept 
//When you try to override the static method it is actually method hiding 
public class StaticMethodOverriding {
	
	public static void M1() {
		System.out.println("I am from Parent");
	}
	
	public void M2() {
		System.out.println("I am from Parent from M2");
	}
	public static void main(String[] args) {
		
		
	}
	

}

class ChildClassOverridingStaticMethod extends StaticMethodOverriding {
	
	public static void M1() {
		System.out.println("I am from Child");
	}
	
	public void M2() {
		System.out.println("I am from Child from M2");
	}
	
	public static void main(String[] args) {
		 // obj is child class reference and referring to child class object 
		ChildClassOverridingStaticMethod obj=new ChildClassOverridingStaticMethod();
		//obj is referring to child class then it will call child class static method 
		obj.M1();
		 // obj1 is parent class reference and referring to child class object 
		StaticMethodOverriding obj1=new StaticMethodOverriding();
		//obj is referring to parent class then it will call parent class static method 
		obj1.M1();
		 // obj2 is parent class reference and referring to child class object 
		//classname referencename/objectname=new classname
		StaticMethodOverriding obj2=new ChildClassOverridingStaticMethod();
		//obj2 is referring to parent class then it will call parent class static method
		obj2.M1(); // this is called as method hiding 
	}
	
}
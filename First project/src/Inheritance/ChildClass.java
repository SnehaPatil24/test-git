package Inheritance;
  //child class is your sub class
//super class is parentclass
//process of obtaining data member(variable) and method one class to another
public class ChildClass extends ParentClass{
     int b;
     public ChildClass()
 	{
    	 super();//parent class constructor which don't have parameter
 		System.out.println("I am in Childclass constructor");
 	}
     //if you want to call parent class constructor from child class we use super()
     public ChildClass(int a)
     {
    	 this();//same class constructor which don't have parameter
     }
     public static void main(String[] args) {
    	 
    	 ChildClass obj=new ChildClass();
    	 System.out.println(obj.a);
    	 System.out.println(obj.b);
	
    }
     //you have 3 variable with same name b
     //int b at M2====>loca variable
     //int b in child class===>this.b
     //int b in parent class===>super.b
     //int a in parent class===>this.a
     public void M2(int b)
     {
    	 this.b=b; //child class variable
    	 super.b=b;//parent class variable
    	 this.a=b;
    	 System.out.println("I am in Childclass ");
     }
}

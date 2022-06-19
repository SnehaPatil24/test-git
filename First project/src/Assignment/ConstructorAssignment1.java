//Create two object , one with calling no parameter constructor and 
//another with single parameter constructor
package Assignment;

import constructors.Test;

public class ConstructorAssignment1 {
	//int a;
    
   
    private ConstructorAssignment1()
    {
  	  System.out.println(" I am ConstructorAssignment1 class");
  	  //a=5;
    }
    
    public ConstructorAssignment1(int var)
    {
  	  System.out.println(" I am parameterized constructor");
  	 // a=var;
    }
    
   public static void main(String[] args) {
  	 
	   ConstructorAssignment1 t=new ConstructorAssignment1();
		
		//System.out.println(t.a);
		ConstructorAssignment1 t1=new ConstructorAssignment1(15);
		//System.out.println(t1.a);
	}
}

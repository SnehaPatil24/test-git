package error;

import abc.Mock_program1;

public class Logicalerror {
	 public static void main(String[] args) {
		   Logicalerror obj=new Logicalerror();
		   obj.add(45, 54);
		  Mock_program1 obj1=new Mock_program1();
		  float s=obj1.add(12.3f, 16);
		  System.out.println("calling from another class "+s);
		   
	   } 
		   public void add(int a,int b)
		   {
			   System.out.println(a+b);
		   }
}

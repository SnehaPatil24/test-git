package myFirstPackege;
//Static and not static (instance variable) need to declare within the class outside the method
//Local variable need to declare with in the method
public class DataType {
	// non-static /instance variable
			public byte var1;
			public short var2;
			public int var3;
			public long var4;
			public char var5;
			public boolean var6;
			public float var7;
			public double var8;
			
			//static variable (static keyword is used )
			public static int var9;
			
			public void add() {
				//local variable declaration and initilization  
				int  var11=80; //it is mandatory to initilized before using it 
				System.out.println(var11);
				
			}
			
		//declaration Initilazation 
			public static void main(String[] args) {
						
				// To call or use instance variable , we can do through object
				DataType obj=new DataType();
				System.out.println("This is beginining of program");
			    System.out.println("This is default value of var1 " + obj.var1); //default value of byte is zero
			    System.out.println("This is default value of var2 "+ obj.var2); //default value of short is zero
			    System.out.println("This is default value of var3 " + obj.var3); //default value of int is zero 
			    System.out.println("This is default value of var4 " + obj.var4); //default value of long is zero
			    System.out.println("This is default value of var7 " + obj.var7); //default value of float is 0.0
			    System.out.println("This is default value of var8 " + obj.var8); //default value of double is 0.0
			    System.out.println("This is default value of var5 " + obj.var5); //default value of char is blank
			    System.out.println("This is default value of var6 " + obj.var6); //default value of boolean is flase
			    System.out.println("I am static variable "+ DataType.var9); //accessing static variable through class name
			    System.out.println("Accessing static variable though instance "+ obj.var9);//accessing static variable through through object
			    System.out.println("I am accessing static variable directly "+ var9); //accessing static variable directly static method
			    // Changing the value of var1 variable 
				obj.var1=15;
			    obj.var2=obj.var1;
			    System.out.println("var1 "+ obj.var1); //byte size =1
			    System.out.println("var2 "+ obj.var2); //short size =2
			    obj.var2=1555;
			/*    obj.var1=(byte) obj.var2;// down casting/narrow casting not recommended 
			    System.out.println("var1 "+ obj.var1);*/
			    
			   

			}
			
			public double var10; //You can define static and non static variable anywhere within the class 

}

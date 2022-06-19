package variable_practice;

public class VariablePractice {
	//variable declaration 
			public boolean var;//
			private char var1;//
			protected byte var2;
			short var3;
			public int var4; //4 byte
			private long var5; //  8 byte
			protected float var6; // 4 byte
			double var7;  // 8 byte
			
			//declaration +Initialization
			public boolean var8=true; //a=5;
			
			
			//boolean can only hold true or false , if we try to assign other value
			//we will get compilation error
			//public boolean var9=5;
			
			//char need to be represent in single quote
			public char var10='a'; // if you write double quote then you will get compilation error
			
			//char data type can only hold single character
			//public char var11='ab';
			
			//byte size 1byte  =2^8 to  -128 to 127 
			public byte var12=127; // byte can hold value till 127 max
			
			//public short var13=32767;
			
			//int can store maximum 2147483647
			public int var13=2147483647; //4 byte
			//by default long will be treat as int and 4 byte memory will be allocate
			//to treat it as long and allocate 8 byte memory we need to sufix l as shown below
			private long var14=2147483648l; //  8 byte
			//by default float will be treat as double and 8 byte memory will be allocate
			//to treat it as float and allocate 4 byte memory we need to sufix f as shown below
			protected float var15=0.4f; // 4 byte 4.0   
			public double var16;
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				VariablePractice shubham=new VariablePractice();
				// classname  reference=new classname();
				//To print on console use below method/class given by java
				System.out.println("I am printing on console"); //short key syso press CTRL+space
				System.out.println("Default value of boolean variable var is "+shubham.var);
				System.out.println("Default value will be assign as var8 is having true value   "+shubham.var8);
				System.out.println("Default value of character variable var1 is "+shubham.var1); //default value is space
				System.out.println("Default value of byte variable var2 is "+shubham.var2); 
				System.out.println("Default value of short variable var3 is "+shubham.var3); 
				System.out.println("Default value of int variable var4 is "+shubham.var4); 
				System.out.println("Default value of long variable var5 is "+shubham.var5); 
				System.out.println("Default value of float variable var6 is "+ shubham.var6); 
				System.out.println("Default value of double variable var7 is "+shubham.var7); 
				

			}
}

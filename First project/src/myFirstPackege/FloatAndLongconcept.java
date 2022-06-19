package myFirstPackege;
//This class is to expalin the concept of Float and Long 
//You can write the Float in two ways one without f prefix and other with f prefix
//If you don't write the f prefix , it will consider as double bydefault
//Same is for Long data type , one is with L prefix and other is without L prefix
//If you don't write L prefix , it will be consider as int not the long
public class FloatAndLongconcept {
	//float var1 without f prefix 
			public float var1=12f; //it will be treated as double 8 bytes
			//Long without L prefix
			public long  var2=2147483648L; //As L suffix is not there , var2 will be consider as int, Value is more than interger size it will throw error 
			//float var3 with f prefix
			public float var3=12f; //it will be treated as float 4 byte
			//Float var4 with Long prefix 
			public long  var4=2147483648l; // Value is more than interger size it will not throw error 
			
			//byte //short //int //long 
			public static void main(String[] args) {
			
				FloatAndLongconcept obj=new FloatAndLongconcept();
				System.out.println("Float Value" + obj.var1);
				System.out.println("Hello World!" + obj.var2);
				System.out.println("Float Value" + obj.var3);
				System.out.println("Hello World!" + obj.var4);
			
		}
}

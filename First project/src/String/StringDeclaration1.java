package String;

import Scanner_class.ScannerExample;

public class StringDeclaration1 {
	//String is not Reserved word
	
		//String Declaration
		public static String var;
		public ScannerExample var1;
		public int var3=3; //literal integer 
		
		//String initlization can be done in two ways 
			
		  // A. By using literal
				//String a="abc";
		//  B. By using new object
			  //String b=new String ("abc");
		
		public static void main(String[] args) {
			//String initilization
			var=new String("Pankaj");
			//System.out.println(var);
			String a="Test";  ///declare and initilised the string a
			String p=var.concat("Jain"); //Pankaj +Jain
			System.out.println(var);
			//String is immutable once you created then you can't modify
			
			//String buffer is mutable
			StringBuffer obj=new StringBuffer("Pankaj");
			obj.append("Jain");
			System.out.println(obj);
			

		}
}

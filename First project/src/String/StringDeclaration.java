package String;

public class StringDeclaration {
	//String is not Reserved word
	
		//String Declaration
		//Static variable 
		public static String var; //non-primitive data type
		//data type -primitive
		//variable type -instance 
		public int var3=3; //literal integer 
		
		//String initlization can be done in two ways 
			
		  // A. By using literal
				//String a="abc";
		//  B. By using new object
			  //String b=new String ("abc");
		
		public static void main(String[] args) {
			/*//String initilization
			var=new String("Pankaj");
			//System.out.println(var);
			String a="Test";  ///declare and initilised the string a
			String p=var.concat("Jain"); //Pankaj +Jain
			System.out.println(var);  //Pankaj
			//String is immutable once you created then you can't modify
	*/		
			//String buffer is mutable
			StringBuffer obj=new StringBuffer("Pankaj");
			System.out.println("Original value of Obj " + obj);
			obj.append("Jain"); //pankaj jain
			System.out.println("Change value of obj after append");
			System.out.println(obj);
			
			//String is immutable
			var=new String("Pankaj");
			System.out.println("Original value of var " + var);
			var.concat("Jain"); //it will create object
			System.out.println("Change value of var after concat");
			System.out.println(var);//Pankaj

		}

}

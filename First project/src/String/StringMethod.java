package String;

public class StringMethod {
	//var is storing string in UPPERCASE
		public static String var="TESTING"; 
		//var1 is storing string in lowecase
		public static String var1="testing";

		public static void main(String[] args) {

			
			//Length method need to use to check the length of a string 
			//length calculation will start from 1 
			System.out.println("Length of a String "+ var.length());
			
			//Tell me which the character at position within the string 
			// ChatAt take one parameter that is index which start from 0
			// String var="Testing"  so this indexing will be 0123456
			// so s will be printed for position 2 
			  System.out.println("Character at 2nd position " +var.charAt(2));
			
			// If we try to retrieve character at position which is not present 
			// then java will throw Stringindexoutof bound exception
			//System.out.println(var.charAt(7));
			  
			  // Checking whether string is empty or not 
			  System.out.println("Checking whether string is empty or not  " + var.isEmpty());
			  
			  //Checking whether two String is equal or not using equals
			  
			  System.out.println("Checking whether both the string are equal " + var.equals(var1));
		
			  //Checking whether two String is equal or not using equalsIgnoreCase 
			  
			  System.out.println("Checking whether both the string are equal " + var.equalsIgnoreCase(var1));
		
			  // Checking whether string is start with Tes                   //TESTING.startswith("Tes")
			  System.out.println("Checking whether var is start with Tes" + var.startsWith("Tes"));
		
			  // Var="TESTING"---In below we used tolowercase method it will change string 
			  //from upper case to lowercase
			  System.out.println(var.toLowerCase());
			  
			// Var1="testing"---In below we used touppercase method it will change string 
			  //from lower case to upper
			  System.out.println(var1.toUpperCase());
			  
			// Checking whether string is start with tes                    //testing.startswith("tes")                     
			  System.out.println("Checking whether var is start with tes " + var.toLowerCase().startsWith("tes"));
			  	// String Method chaining 
			  System.out.println(var.toLowerCase().endsWith("g"));
			  
			  //Concat method is used to join the two string 
			  String a=var.concat("Software"); //Testing Software
			  System.out.println(a);//String is immutable
			  
			//JAVA CASE SENSITIVE so we are using to lower case first as var is in capital letter
			  //contains is using to check whether string contains particular value 
			  System.out.println("Checking whether string contains particular value "+ var.toLowerCase().contains("te")); //testing.contains("te")
			
			 String var1="Manual Tester"; //Automation Tester
			 System.out.println("Replace method is used to replace particular string with new string "+var1.replace("Manual","Automation"));
			 
			 // Split returns array of string 
			 // All will be return String
			 // if you want to represent homogeneous data type in one variable--->Array
			 // Array stores the value in the form of index 
			 //We split Manual Testing with space criteria ---[0] Manual [1] Tester 
			 //Split is used to divide the string but as java is machine we need to tell how you want to do split
			 //in below problem we are asking java to split var2 with p as criteria
			 String var2="Manual Tester life is relax only package is problem";
			 //Manual Tester life is relax only--->[0] 
			 //ackage is --->[1]
			 //roblem---[2]
			 //spilt output will not content the word through which you are doing split 
			 //like in this you are spliting using p 
			 System.out.println(var2.split("p")[0]);
			
			 String var3="				Testing for the space termination   ";
			 System.out.println("String without trim" + var3);
			 // Trim will only remove front and back space but not the space which is in the middle 
			 System.out.println("String with trim " + var3.trim());
		
			 
			 //Tell the difference between == , equals and compareTo
			  
			 String var4="I am Priyanka";
					 
					 
		}
}

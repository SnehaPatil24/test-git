package String;

public class StringBufferExample {
    //StringBufferExample --->programmer cha class
	//StringBuffer--->java cha class
	public static void main(String[] args) {
		//to get access of String buffer we need to create object
		//object with no parameter constructor
		StringBuffer obj1 = new StringBuffer();
		System.out.println(obj1.length());
		//obj with String as parameter constructor 
		StringBuffer obj=new StringBuffer("This is for testing");
		System.out.println(obj.length());
		
		//Stringbuffer specific method
		//Append---Append the new string in existing string
		// You have many append methods based on which you have to append you can use that
		//For example if you want to append int value use append (int ) method
		System.out.println(obj.append(34567890));
		System.out.println("This is string before delete " +obj.append(true));

		// delete will delete the string of specific index 
		System.out.println("This is string after delete "+ obj.delete(0,10));
		
		
		//deletecharAt will delete specific character 
		System.out.println("Final string after delete char at" + obj.deleteCharAt(0));
		
		System.out.println(obj.insert(5, "EXample"));
		//replace=delete + insert
		System.out.println(obj.replace(0, 10, "String"));
		
		System.out.println(obj.reverse());
	}
}

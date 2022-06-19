package String;

public class String_MethodPart2 {
	public static void main(String[] args) {
		String str="This is string for functions";
				  //01234567891011
	/*	System.out.println("---contains method-------");
		//contains method will help to find whether particular word is 
		//present in string or not 
		System.out.println(str.contains("is")); //true
		System.out.println("---endsWith method-------");
		//endsWith method will help to find whether particular string is ending
		//with respective word
		System.out.println(str.endsWith("s"));
		System.out.println("---startsWith method-------");
		//startsWith method will help to find whether particular string is starting
		//with respective word
		System.out.println(str.startsWith("This"));
		System.out.println("---hashCode method-------");
		//hashcode will return the int value of object
		System.out.println(str.hashCode());*/
		
		System.out.println("---indexOf method-------");
		System.out.println(str.indexOf("is"));
		System.out.println("---lastIndexOf method-------");
		System.out.println(str.lastIndexOf("is"));
		System.out.println("---isEmpty method-------");
		System.out.println(str.isEmpty());
		System.out.println("---split method-------");
		//str.split("is");
		System.out.println("---substring method-------");
		//it will start from index 2 and and as no end index is given
		//it will take remaining String 
		System.out.println(str.substring(8));
		System.out.println("---substring method-------");
		//it will start from index 2 and end with index 6
		System.out.println(str.substring(2, 6));
		

	}

}

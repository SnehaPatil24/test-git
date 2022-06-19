package collection;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		
		//Create LinkedList collections 
		//It is part of list interface so duplicates are allowed
		LinkedList<String> obj=new LinkedList<String>();
		//Add the object at first 
		obj.addFirst("String first");
		obj.add("Testing");
		//Add the object at last position
		obj.addLast("Checking");
		obj.add("Testing");
		obj.addLast("rere");
		obj.add(0, "String two");
		//Add the object at first position
		obj.addFirst("String two");
		System.out.println(obj);

}
	
}

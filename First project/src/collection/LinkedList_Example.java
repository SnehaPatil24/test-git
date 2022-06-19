package collection;

import java.util.LinkedList;

public class LinkedList_Example {
	public static void main(String[] args) {
	     LinkedList obj=new LinkedList<>();
	     obj.add(1);
	     obj.add("String");
	     System.out.println(obj);
	     obj.addFirst("I am first");
	     System.out.println(obj);
	     obj.removeLast();
	     System.out.println(obj);
	     System.out.println(obj.getFirst());

		}
}

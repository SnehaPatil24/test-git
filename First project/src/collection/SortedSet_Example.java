package collection;

import java.util.TreeSet;

public class SortedSet_Example {
	
  public static void main(String[] args) {
	  
	TreeSet<Integer> obj=new TreeSet<Integer>();
	
	obj.add(10);
	obj.add(1);
	obj.add(20);
	obj.add(50);
	obj.add(80);
	obj.add(11);
	obj.add(13);
	obj.add(18);
	obj.add(10);//duplicate
	obj.add(19);
	System.out.println(obj);
	
	System.out.println("first object"+obj.first());
	System.out.println("last object"+obj.last());
	
	System.out.println(obj.headSet(19));
	//it will return object which are less then 19
	System.out.println(obj.tailSet(19));
	//it will return object which are greater than 19 or equal to 19 
	System.out.println(obj.subSet(10, 19));
	//it will create new set where object are greater than equal to 10 and less than 19
	System.out.println(obj.pollFirst());
	System.out.println(obj.pollLast());
	
	
	System.out.println("for string");
	TreeSet<String> ob=new TreeSet<String>();
	ob.add("a");
	ob.add("s");
	ob.add("d");
	ob.add("f");
	ob.add("u");
	ob.add("j");
	ob.add("m");
	ob.add("t");
	ob.add("a");//duplicate
	ob.add("e");
	System.out.println(ob);
	
}
}

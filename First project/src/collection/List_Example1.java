package collection;

import java.util.ArrayList;

public class List_Example1 {
	public static void main(String[] args) {
		
		ArrayList t=new ArrayList();
		t.add(1);  //0
		t.add("Testing"); //1
		//Add method of list interface 
		t.add(1, "List Add method");
		System.out.println(t);
		
		ArrayList p=new ArrayList<>();
		p.add("check");
		p.add(10);
		
		t.addAll(p);
		
		System.out.println(t);
		
		ArrayList p1=new ArrayList<>();
		p1.add("third collection");
		p1.add(100);
		
		t.addAll(1, p1);
		System.out.println(t);
		
		//Remove methods
		t.remove(1);//here 1 is treated as index value
		//but we want 1 to be treated as object
		t.remove(Integer.valueOf(1));
		System.out.println(t);
		//Below method is from list interface which take a parameter
		//index ---> If we try to delete object which is not present 
		//at respective index ---OutofBound
		//t.remove(100);
		//Below method is of collection interface
		//which take object as parameter ,if present delete
		//if not return false --No exception 
		System.out.println("output " +t.remove("tt"));
		System.out.println(t);
		t.removeAll(p1);
		System.out.println(t);
		
		///List allow duplicate 
		t.add(10);
		System.out.println(t);
		
		//List--Get(int index)
		//It will allow to get the specific object based on 
		//index
		System.out.println(t.get(2));
		
		//List-Set(int index ,Object o)
		t.set(2, 1000);
		//t.add(4, 1000);
		System.out.println(t);
		System.out.println(t.indexOf("Testing"));
		t.add("Testing");
		System.out.println(t);
		System.out.println(t.lastIndexOf("Testing"));
		t.add(null);
		System.out.println(t);
		
		ArrayList j=new ArrayList(t);
		System.out.println(j);
		System.out.println(j.size());
		
		
	}
}

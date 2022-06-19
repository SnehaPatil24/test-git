package collection;

import java.util.ArrayList;

public class List_example {
	public static void main(String[] args) {

		ArrayList t = new ArrayList();
		t.add(1);
		t.add("testing");
		t.add(1, "list add method");// add method of list interface
		System.out.println(t);

		ArrayList p = new ArrayList();
		p.add("check");
		p.add(10);
		t.addAll(p);
		System.out.println(t);

		ArrayList p1 = new ArrayList();
		p1.add("third collection");
		p1.add(100);
		t.addAll(1, p1);
		System.out.println(t);
		
		t.remove(1);//here 1 is treated as index value 
		//but we want 1 to be treated as object
		System.out.println(t);
		
		t.remove(Integer.valueOf(1));
		System.out.println(t);
		
		/*below method is from list interface which take parameter
		index-->if we try to delete object which is not present
		t.remove(100);*/
		System.out.println("output"+t.remove("tt"));
		System.out.println(t);
		
		t.removeAll(p1);
		System.out.println(t);
		
		//list allow duplicate
		t.add(10);
		System.out.println(t);
		//list --Get(int index)
		//It will allow to get the specific object besed on index
		System.out.println(t.get(2));
		
		//list--Set(int index,object o)
		t.set(4, 1000);//set replace the value
		System.out.println(t);
		System.out.println(t.indexOf("testing"));
		t.add("testing");
		System.out.println(t);
		System.out.println(t.lastIndexOf("testing"));
	    t.add(null);
		System.out.println(t);
		
		ArrayList j=new ArrayList(t);
		System.out.println(j);
		
		System.out.println(j.size());
		
		
		
	}
}

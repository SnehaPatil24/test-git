package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset_example {
	public static void main(String[] args) {
		
		HashSet<Object> obj = new HashSet<>();
		obj.add(1);
		obj.add(2);
		obj.add(0);
		obj.add("tt");
		obj.add(1);// it will not be added as 1 is already present if you to add duplicate object

		System.out.println(obj);
		//clone----copy
		//obj--hashset
		//copy hashset
		HashSet<Object>t=(HashSet) obj.clone(); 
		System.out.println(t);
		System.out.println("ArrayList");
		ArrayList<Object> p = new ArrayList<>();

		p.add(1);
		p.add(2);
		p.add(0);
		p.add("tt");
		p.add(1);// it will not be added as 1 is already present if you to add duplicate object

		System.out.println(p);
		System.out.println("LinkedHashSet");
		LinkedHashSet<Object> o= new LinkedHashSet<>();
		o.add(1);
		o.add(2);
		o.add(0);
		o.add(1);
		System.out.println(o);

	}
}

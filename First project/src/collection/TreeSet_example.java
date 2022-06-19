package collection;

import java.util.TreeSet;

public class TreeSet_example {
	public static void main(String[] args) {

		TreeSet<Integer> obj = new TreeSet<>();

		obj.add(1);
		obj.add(5);
		obj.add(0);
		obj.add(10);
		obj.add(1);// duplicate
		obj.add(4);
		obj.add(2);
		obj.add(3);// some sorting order

		System.out.println(obj);
	}
}

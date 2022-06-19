package collection;

import java.util.ArrayList;

import MethodOverloading.Test;

public class ArrayList_TestClass {
	public static void main(String[] args) {
		ArrayList<Test> t=new ArrayList<>();
		Test p=new Test();
		//a=b; Test p=new Test();
		//c=a  t.add=Test p
		//c=b  t.add=new Test();
		t.add(p);
		t.add(new Test());
		t.add(new Test());
		System.out.println(t);
		
		

	}

}

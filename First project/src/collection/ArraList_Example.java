package collection;

import java.util.ArrayList;

public class ArraList_Example {
public static void main(String[] args) {
		
		//collection is nothing group of objects represented as single entity
		ArrayList<Object> pankaj=new ArrayList<Object>();//we created object of arraylist
		//Add method will help to add object one by one in collection
		pankaj.add(1);//1 represent int value---It is object of Integer class
		pankaj.add(2);//Integer 
		pankaj.add("Test");//hetrogeneous object --String Object
		System.out.println(pankaj); 
		
		//AddAll--when we want to add one collection in another
		ArrayList t=new ArrayList();
		t.addAll(pankaj);
		System.out.println(t);
		//When we want to remove object from collection
		//t.remove(1); //it will remove object whose name is 1
		t.remove("Test"); //remove(Object o)
		System.out.println(t);
	}

}

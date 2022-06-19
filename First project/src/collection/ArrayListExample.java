package collection;

import java.util.ArrayList;

public class ArrayListExample {
public static void main(String[] args) {
		
		int[] a=new int[3];//array only support homogeneous 
		a[0]=1;
		//a[1]="Str"; //compilation error
		
		
		int b=3;
		// Collection support hetrogeneous objects 
		ArrayList<Object> obj=new ArrayList<Object>();
		obj.add("String"); //We added String
		obj.add(b); //we added int wrapper classes int --Integer 
		obj.add(45);
		obj.add(1, 344);
		System.out.println(obj);
		//Whether compiler throw any error - No 
		//Because collection support hetrogeneous object
		//collection is nothing but group of objects represent as single entity 
		
		//If you want to retrive specific object from collection we use get method
		System.out.println(obj.get(0)); //it means please give object from collection which is at position 0
		System.out.println(obj.get(1));
		System.out.println(obj.size()); //it will represent actual size of collection
		
		

	}
}

package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class NavigableSet_Example {
	 public static void main(String[] args) {
		  
			TreeSet<Integer> obj=new TreeSet<Integer>();
			obj.add(10);
			obj.add(1);
			obj.add(2);
			obj.add(5);
			obj.add(8);
			obj.add(7);
			obj.add(3);
			obj.add(8);
			obj.add(10);//duplicate
			obj.add(9);
			System.out.println(obj);
			
			System.out.println(obj.ceiling(5));//  o/p---5
			//it will return the object which greater or equal 
			//[1, 2, 3, 5, 7, 8, 9, 10] equal will work
			
			System.out.println(obj.ceiling(6));//  o/p----7
			//it will return the object which greater or equal 
			//[1, 2, 3, 5, 7, 8, 9, 10] equal will not work
			

			System.out.println(obj.ceiling(11));//  o/p-----null
			//it will return the object which greater or equal 
			//if both criteria doesn't match then it will return null
			//[1, 2, 3, 5, 7, 8, 9, 10] equal will not work
			
			System.out.println(obj.floor(5));//  o/p-----5
			//it will return the object which less or equal [1, 2, 3, 5, 7, 8, 9, 10] 
			
			System.out.println(obj.floor(4));//  o/p-----3
			//it will return the object which less or equal [1, 2, 3, 5, 7, 8, 9, 10] 
			
			System.out.println(obj.floor(0));//  o/p-----null
			//it will return the object which less or equal [1, 2, 3, 5, 7, 8, 9, 10] 
			
			System.out.println(obj.descendingSet());
			//it will return set in descending order
			
			Iterator itr=obj.descendingIterator();
			//it will create new set which is descending order 
			//[10, 9, 8, 7, 5, 3, 2, 1]
			//then it will handover to iterator
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			Iterator p=obj.iterator();
			while(p.hasNext())
			{
				System.out.println(p.next());
			}
			
			System.out.println(obj.higher(5));// o/p---8
			//it will return object which greater [1, 2, 3, 5, 7, 8, 9, 10]
			
			System.out.println(obj.higher(10));// o/p----null
			//it will return object which greater if not element is greater than 10 [1, 2, 3, 5, 7, 8, 9, 10]
			
			System.out.println(obj.lower(5));//  o/p-----3
			//it will only check less than
			// [1, 2, 3, 5, 7, 8, 9, 10] 
			
			
	 }
}

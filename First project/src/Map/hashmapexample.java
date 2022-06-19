package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class hashmapexample {
   public static void main(String[] args) {
	   HashMap<String,Integer> obj=new HashMap<>();
		obj.put("a",1);
		obj.put("b",2);
		obj.put("c",3);
		obj.put("d",4);
		obj.put("e",5);
		
		System.out.println(obj.containsKey("h"));//o/p ---->false
		//it will check whether key is present or not
		System.out.println(obj.containsKey("e"));//  o/p------>true
		
		System.out.println(obj.containsValue(7));//  o/p------>false
		//it will check whether value is present or not
		System.out.println(obj.containsValue(4));//  o/p------>true
		
		System.out.println(obj.isEmpty());// o/p--->false
		System.out.println(obj);
		
		System.out.println("retrieving keys");
		System.out.println(obj.keySet());
		
		// i want to retrive key one by one
		Set<String> p=obj.keySet();//group of object where
		Iterator<String> itr=p.iterator();
		while(itr.hasNext())
		{
			System.out.println("keys "+itr.next());
		}
		
		Collection<Integer> t=obj.values();
		Iterator<Integer> itr1= t.iterator();
		while(itr1.hasNext())
		{
			System.out.println("values" +itr1.next());
		}
		
		Set<Entry<String,Integer>> test=obj.entrySet();
		Iterator<Entry<String,Integer>>  it=test.iterator();
		while(it.hasNext())
		{
			/*Entry<String,Integer> j=it.next();
			System.out.println(j.getKey());
			System.out.println(j.getValue());*/
			System.out.println(it.next());
			
		}
}
}

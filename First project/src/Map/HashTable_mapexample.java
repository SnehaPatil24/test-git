package Map;

import java.util.HashMap;
import java.util.Hashtable;


public class HashTable_mapexample {
 public static void main(String[] args) {
	 HashMap<String,String> obj=new HashMap<>();
		obj.put(null, "test");
		obj.put("one","testing");
		System.out.println(obj);
		
		Hashtable<String,Integer> y=new Hashtable<>();
		y.put(null, 1);
		System.out.println(y);
}
}

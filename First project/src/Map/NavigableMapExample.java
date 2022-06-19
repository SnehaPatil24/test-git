package Map;

import java.util.TreeMap;

public class NavigableMapExample {
	public static void main(String[] args) {
		//NavigableMap is interface so we need to create object of TreeMap
		TreeMap<Integer, String> obj=new TreeMap<Integer, String>();
		//Map put method is used to add the key values in collections
		obj.put(1, "One");
		obj.put(2, "two");
		obj.put(6, "three");
		obj.put(4, "four");
		obj.put(5, "five");
		
		System.out.println(obj);
		//Returns the least key greater than or equal to the given key, or null if there is no such key.
		System.out.println(obj.ceilingKey(3));
		//Ceiling key method will retrieve at least key greater than or equal to the given key, or null if there is no such key 
		System.out.println(obj.ceilingEntry(3));
		//Returns a reverse order view of the mappings contained in this map.
		System.out.println(obj.descendingMap());
		//Returns a reverse order NavigableSet view of the keys contained in this map.
		System.out.println(obj.descendingKeySet());
		//It wil return partial map
		System.out.println(obj.subMap(2, 5));

	}
}

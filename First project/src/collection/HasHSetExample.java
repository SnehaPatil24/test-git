package collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class HasHSetExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> obj=new HashSet<String>();
		obj.add("TEst");
		obj.add("TEsting");
		obj.add("TEstig");
		obj.add("TEstig");
		HashSet<String> obj1=(HashSet<String>) obj.clone();
		obj.remove("TEst");
		System.out.println(obj1);
		System.out.println(obj);
		
		
	}

}

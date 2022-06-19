package Map;
import java.util.HashMap;
import java.util.IdentityHashMap;;
public class IdentityHashmap_example {
	
	public static void main(String[] args) {
		HashMap<String,String> obj=new HashMap<>();
		obj.put("one", "test");
		obj.put(new String("one"),"testing");
		System.out.println(obj);
		
		IdentityHashMap<String,String> obj1=new IdentityHashMap<>();
		obj1.put("one", "test");
		obj1.put(new String("one"),"testing");
		System.out.println(obj1);
		
	}

}

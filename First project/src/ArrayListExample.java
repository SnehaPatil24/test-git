import java.util.ArrayList;

public class ArrayListExample {
 public static void main(String[] args) {
	
	  ArrayList<Object> obj=new ArrayList<Object>();
	 obj.add(10);
	 obj.add(23);
	 obj.add(15);
	 obj.add(18);
	 obj.add(13);
	 obj.add(10);
	 obj.add(null);
	 obj.add("sneha");
	 System.out.println(obj);
	 
	 
	 ArrayList<Object> obj1=new ArrayList<Object>();
	 obj1.add(1);
	 obj1.add(2);
	 obj1.add(1);
	 obj1.add(8);
	 obj1.add(3);
	 obj1.add(0);
	 obj1.add(null);
	 obj1.add("sneha");
	 obj.addAll(obj1);
	 System.out.println(obj);
	 
	 obj.remove(3);
	 System.out.println(obj);
	 
	 obj.remove(Integer.valueOf(1));
	 System.out.println(obj);
	 
	 obj.set(4, 89);
	 System.out.println(obj);
	
	 
	 
	 
}
}

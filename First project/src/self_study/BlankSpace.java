package self_study;

public class BlankSpace {
	 public static void main(String[] args)
	    {
	        String str = "     sdas    hfdjs  jfala        ";
	       
	        // Call the replaceAll() method
	        str = str.replaceAll("\\s", "");
	       
	        System.out.println(str);
	    }
}

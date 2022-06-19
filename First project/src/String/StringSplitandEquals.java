package String;

public class StringSplitandEquals {
	public static void main(String[] args) {
		String p="A"; // it will be in SCP and it will create A
		String q="A";//It will not create in SCP but will point to same
		String r=new String("A");//It will create in Heap and point to it 
		String s="a";// it will create in SCP
		//== check whether both the reference is pointing to same object or not 
		System.out.println(r==q);
		//Equals method only check content
		System.out.println(r.equalsIgnoreCase(q));
		System.out.println(p.compareTo(s));
		
		String s4="This is string for is split the string";
		String[] splitarray=s4.split("is");
		System.out.println(splitarray.length);
		for(String j:splitarray) {
			System.out.println(j);
		}
	}
}

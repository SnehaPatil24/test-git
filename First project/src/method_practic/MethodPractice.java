package method_practic;

public class MethodPractice {
	public int var1;// non static instance variable
	private static int var3;//static method
    int var4=5;//declaration + initialization
    static MethodPractice obj;//declaration
    private float var2;//instance variable
    
    //syntax of method
    /*<access_modifier><non_access_modifier><retuen_type><method_name>(){
      method body
      
      }
    */
    //instance method which is returing int value
    protected char m2() {
    	System.out.println("i am fron m2");
    	return 1;
    	
    }
    //static method which is not returing any value
    private static void m3() {
    	System.out.println("i am in m3 method");
    }
    public static int m4()
    {
    	System.out.println("i am in m4 ");
    	return 1;
    }
     //instance method which is not returing any value
    private void m1()
    {
    	System.out.println("i am in m1 method");
    }
    public static void main(String[] args) {
		int a;//local variable
		MethodPractice.m3();
		m4();
		MethodPractice obj1=new MethodPractice();
		obj1.m1();
		obj1.m2();
	}
    
    
}

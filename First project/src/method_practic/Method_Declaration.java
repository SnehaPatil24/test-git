package method_practic;

public class Method_Declaration {
    // global variable inside class and outside method
	public int a;//instance variable
	public static int b;//static variable
	
	public static void main(String[] args) {
		int c;//local variable
		Method_Declaration obj=new Method_Declaration();
		//objectname.methodname method call syntax
		obj.m1();
		obj.m2(false);
		obj.m3(23,false,45.65);
		obj.add(23,45);
		Method_Declaration.m4();
		Method_Declaration.test('c',43.0f);
	}
	//method syntax
	/*<access_modifier><retun type><method name>()
	 * {
	 * }*/
	 //i need one method name as m1
	//access modifier public 
	//return type -void (it means not returing any value)
	//method name m1
	//parameter -no parameter
	public void m1()
	{
	     System.out.println("i am in m1 method without parameter");
	}
	//I need one method with name as m2 having one int parameter
	//access modifier-protected
	//return type-void(it means it is not returning any value)
	//method name-m2
	//parameter-one parameter having dadatype int
    protected void m2(boolean a) {
    	 System.out.println("I am m2 method and asking for boolean parameter ");
    }
    //method m3 having 3 parameter 
    private void m3(int b, boolean p,double d)
    {
    	System.out.println("b value " +b);
    	System.out.println("p value " +p);
    	System.out.println("d value " +d);
    }
  //method syntax
  	/*  <access_modifier><non access_modifier><return_type> <method_name>(){
  	 * }
  	 */
    //method m4 -should be static  without return type and no parameter
    public static void m4() {
    	System.out.println(" I am static method ");
    }
    //method type--instance method and static method
    public int add(int j,int k)
    {
    	int r=j+k;
    	System.out.println("addition is " +r);
    	return r;
    }
    //static method with return type as boolean and having two parameter
    //default-within package
    //non access modifier-static
    static boolean test(char k,double w) {
    	System.out.println("............");
    	return false;
    }
    
	
}

package method_practic;

public class MethodPracticewithParameter {
   public int var1;// instance variable....variable declare inside class outside method without static keyword
   private static int var3;//static variable.....variable declera inside class outside method with static keyword 
   int var4=5;//declaration + initialization
   //static MethodPractic obj;  //declaration
   private float var2;//instance variable
    public static void main(String[] args) {
    	MethodPracticewithParameter neha=new MethodPracticewithParameter();
    	neha.add(14,5);
    	MethodPracticewithParameter.addition(1, 4, 6);
    	int prakash=neha.returnadd(10, 20);//value store in local variable
    	neha.var1=neha.returnadd(12, 24);//value store in instance variable
    	System.out.println(prakash+neha.var1);
	}
   //syntax of method without parameter/argument
    /*<access modifier><non access modifier><return type><method name>(){
      method body
     }*/
    
    //instance method with 2 parameter and no return value
    public void add(int num,int num2)
    {
       System.out.println(num);
       System.out.println(num+num2);
    
    }
    
    //static method with 3 parameter and no return value
    private static void addition(long a,int b,int c)
    {
    	System.out.println(a+b+c);
    }
    
    //instance method with return type and having two parameter
    public int returnadd(int a,int b)
    {
    	//System.out.println(a+b);
    	return a+b;
    }
}

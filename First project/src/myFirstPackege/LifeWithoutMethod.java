package myFirstPackege;

public class LifeWithoutMethod {
	//global variable
    public int a;
    public int b;
    public static int c;//static variable 

public static void main(String[] args) {
	LifeWithoutMethod obj=new LifeWithoutMethod();
	obj.a=25;
	obj.b=35;
	c=obj.a+obj.b;
	System.out.println(c);
	
   System.out.println("addition with method");
	obj.Addition(12,13);
	System.out.println();
	obj.a=10;
	obj.b=25;
	c=obj.a+obj.b;
	System.out.println(c);
  
	System.out.println("addition with method");
	obj.Addition(45,13);
	 System.out.println();
	obj.a=45;
	obj.b=65;
	c=obj.a+obj.b;
	System.out.println(c);
	
	System.out.println("addition with method");
	obj.Addition(96,13);
}
	public int Addition(int p,int q)
	{
		int e=p+q;
		//System.out.println(e);
		return e;
	}
}


public class example {   
	int a;
	public static int b;
   public static void main(String[] args) {
	   example obj=new example();
	   
	   obj.a=23;
	   example.b=43;
	   int d= example.add(12,23);
	   example.sm('c', 'b');
	   
	   System.out.println("addtion of 2 integer no is "+d);
	   
	   int x=example.add(obj.a,example.b);
	   System.out.println("addtion of 2 integer no is "+x);
	   
	  double r= obj.add(12.3f, 10, 42);
	  System.out.println(r);
   }
   public static int add(int a,int b)
   {
	   int c=a+b;
	   return c;
	   //System.out.println("addtion of 2 integer no is" +c);
   }
   public double add(double a,float b,int c)
   {
	   double x=a+b+c;
	   return x;
	   //System.out.println(x);
   }
   public static char sm(char a ,char b)
   {
	   
	   System.out.println("two charactor");
	   return 0;
   }
}

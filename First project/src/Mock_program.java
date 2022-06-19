
public class Mock_program {
  int a;
  public static int b;
  public static void main(String[] args) {
	  Mock_program obj=new Mock_program();
	  obj.add(12, b);
	 float x= Mock_program.add(12.3f, 43);
	 System.out.println(x);
	  int p= Mock_program.add(24, 54);
	  System.out.println(p);
	  
}
   static int add(int a,int b)
  {
	  int c=a+b;
	 return c;
  }
  public static float add(float a,int b){
	 float d=a+b;
	 return d;
	   }
}

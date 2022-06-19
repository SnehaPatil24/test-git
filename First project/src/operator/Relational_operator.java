package operator;

public class Relational_operator {
   public static void main(String[] args) {
	   Relational_operator obj=new Relational_operator();
	int a=5;
	int b=6;
	boolean test=obj.equalto(5,6);
	System.out.println("test   "   +test);
	System.out.println("checking a and b is equal"+(a==b));
	System.out.println("checking a and b is not equal"+(a!=b));
	System.out.println("checking a is gerater than b "+(a>b));
	System.out.println("checking a is gerater than equal to b  "+(a>=b));
	System.out.println("checking a is less than  b  "+(a<b));
	System.out.println("checking a is less than equal to b  "+(a<=b));
}
  public boolean equalto(int a,int b) {
	   return a==b;
   }
}

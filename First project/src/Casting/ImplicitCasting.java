package Casting;

public class ImplicitCasting {
   public int var=25;
   double var1;
   boolean var2;
   byte var3;
   public static void main(String[] args) {
	   ImplicitCasting o=new ImplicitCasting();
	   //process of converting one datatype into another
	   o.var1=o.var;  //int value is converted into double
	   //type casting---->Implicit casting---->primitive
	   System.out.println(o.var);
	   System.out.println(o.var1);
	   o.var3=(byte) o.var;
	   //implicit--when we converting lower to higher
	   //expicit--when we converting higher to lower
	   //whatever we have written before =means we are converting into byte
	   //there is possibility data loss
	   //manual casting
	   System.out.println(o.var3);
	   
	   
	   /*parentclass obj=new childclass();
	   converting one class object to another class object
	 type casting---->Implicit casting---->non primitive*/
}
}

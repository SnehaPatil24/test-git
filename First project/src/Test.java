class R{
 void m1(R a){
  System.out.println("m1 method in class A");	 
 }
}
class B extends R{	
 public void m1(R a){
  System.out.println("m1 method in class B");
 }
}
public class Test{
public static void main(String[] args){
 R a = new R();
 a.m1(a);
 a.m1(new B());
 
B b = new B();
  b.m1(null);
 
 a = b;
 a.m1(null);
 a.m1(new R());
  }
}
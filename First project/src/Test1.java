class A1 {
 void m2(A1 a1){
  System.out.println("One");	 
 }
}
class B1 extends A1 {	

}
public class Test1{
public static void main(String[] args){
 A1 a = new A1();
 a.m2(new A1());

  }
}
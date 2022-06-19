package demo;

public class Swapping {
  void swap(int a ,int b)
  {
	  int temp=a;
	  a=b;
	  b=temp;
	  System.out.println("a="+a);
	  System.out.println("b="+b);
  }
  public static void main(String[] args) {
	  int a=10;
	  int b=20;
	  System.out.println("befote swapping");
	  System.out.println("a="+a);
	  System.out.println("b="+b);
	  System.out.println("after swapping");
	  Swapping s=new Swapping();
	  s.swap(a, b);
	  
}
}

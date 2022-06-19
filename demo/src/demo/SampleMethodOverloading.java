package demo;

public class SampleMethodOverloading {

	 static void test(int a)
	 {
		 System.out.println("running test (int a)");
		 
	 }
	 
	 static void test(int b)
	 {
		 System.out.println("running test (int b)");
		 
	 }
	 public static void main(String[] args) {
		test(10);
	}
}

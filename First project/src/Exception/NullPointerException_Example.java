package Exception;

public class NullPointerException_Example {
	static int[] a;

	public static void main(String[] args) {
		try {
			System.out.println(a[0]);// null pointer
			// program is throwing null pointer exception object
			// but catch block is waiting for ArithmeticException
			// so exception will not be handle so JVM will give
			// exception object to default exception handler
		} catch (ArithmeticException e) {
			System.out.println("i am in catch block");

		} catch (NullPointerException a) {
			System.out.println("i am in null pointer catch block");
		}
		System.out.println("i am in main");

	}

}

package collection;

public class garbage_example {
	static garbage_example t1;

	public static void main(String[] args) {
		garbage_example t = new garbage_example();
		t1 = new garbage_example();
		garbage_example t2 = new garbage_example();
		garbage_example t3 = new garbage_example();
		t3 = t2;
		t1 = null;
		System.gc();

	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("i am getting call");
	}
}

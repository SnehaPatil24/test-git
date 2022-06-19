package WhileLoop_DoWhie;

public class WhileForODDCriteria {
	public static void main(String[] args) {
		WhileForODDCriteria obj=new WhileForODDCriteria();
		boolean a=true;
	    boolean p= obj.OddEven(10);
		System.out.println("output"+p);
		while(a) {
			a=obj.OddEven(10);
			a=obj.OddEven(23);
			a=obj.OddEven(44);
			a=obj.OddEven(67);
			a=obj.OddEven(20);
		}
		//System.out.println("output"+a);
		
	}
	
	public boolean OddEven(int c) {
		boolean d=(c%2==0);
		return d;
	}
}

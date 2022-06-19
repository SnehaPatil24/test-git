package operator;

public class RelationalOperator1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RelationalOperator1 obj=new RelationalOperator1();
		obj.greaterthan(2, 4);
		obj.LessThan(3, 4);
		obj.equalTo(3, 4);
	}
	
	public void greaterthan(int a,int b) {
		System.out.println("a is greater than b ?" + (a>b));  //2>4
	}
	
	public void LessThan(int a,int b) {
		System.out.println("a is less than b ?" + (a<b));  //3<4
	}
	
	public void equalTo(int a,int b) {
		System.out.println("a is equal than b ?" + (a==b));  //3==4
	}
//   >=  <= !=s
}

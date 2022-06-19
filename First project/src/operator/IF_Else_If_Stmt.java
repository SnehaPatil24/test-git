package operator;

public class IF_Else_If_Stmt {
	
	int a;
  //if value is less than 10then print i am less than 10
  //if value is greater than 10 and less than 20 then print i greater than 10 less than 20
	// if it is more than 20 print i am more than 20
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IF_Else_If_Stmt obj=new IF_Else_If_Stmt();
		obj.a=13;
		
		if(obj.a<10) {
			System.out.println("I am less than 10");
		}
		else if(obj.a>10 && obj.a<20) {
			System.out.println("I am greater than 10 less than 20");
		}
		else if(obj.a>20) {
			System.out.println("I am greater than 20");
		}
	}

}

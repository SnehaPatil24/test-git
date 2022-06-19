package operator;

public class Unary_operator {
    public static void main(String[] args) {
		int a=10;
		int b=-34;
		
		System.out.println("value of a = "+a);//10
		a=a+1;
		System.out.println("value of a = "+a);//11
		a+=1;//a=a+1
		System.out.println("value of a = "+a);//12
		System.out.println("value of a = "+(++a));//13
		a=a+1;
		System.out.println("value of a"+a);//14
		a=a+1;//15
		System.out.println("value of a"+a);//15
		System.out.println("++ after variable "+a++);//16

      int c=25;
      //(c++)=> c=c+1; postfix
      System.out.println("++ after variable" + c++);//25 
      System.out.println(c);//26
       
      int d=34;
      System.out.println(--d);//perfix ---33
      System.out.println(d--);// 33 d=32  postfix
      System.out.println(d);
      
		// a=a+1  a+=1 ++a
		boolean q=true;
		System.out.println(q);//true
	  System.out.println(!q);//false



	}
}

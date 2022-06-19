import systemPackage.system_example1;

public class swap {
  int a;
  public static int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap obj=new swap();
		obj.swap(23,54);
		obj.a=23;
		
		//swap.b=43;
		System.out.println(swap.b=43);
		System.out.println(obj.a);
		
	}
    public void swap(int a ,int b)
    {    this.a=a;
         this.b=b;
    	a=a+b;
    	b=a-b;
    	a=a-b;
    	System.out.println("swap value"+a+" "+b);
    }
}

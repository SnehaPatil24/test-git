package DataHiding;

public class Encapsulation {
    //binding data member and member in single unit encapsulation
	//data hiding-is extension encapsulation
	//each and every member will private so that it can't be access outside
	private int a=5;
	private int b;
    public void m1()
    {
    	
    }
    public void seta(int a)
    {
        this.a=a;	
    }
    public int geta()
    {
    	return a;
    }
    public static void main(String[] args) {
		
	}
}

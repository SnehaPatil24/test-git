
public class method {
	
public static void main(String[] args) {
	method m=new method();
	m.swap(23, 76);
	method.swap();
}

    public void swap(int a ,int b)
     {   
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("swap value"+a+" "+b);
     }
    
    public static void swap()
    {
    	int p=23;
    	int q=54;


    	p=p+q;
    	q=p-q;
    	p=p-q;
    	System.out.println("swap value"+p+" "+q);		
    }
}


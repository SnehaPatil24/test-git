/*2. Create one class and try to overload method with changing following
A. Method signature is same but return type is different
B. Method signature is same but access modifier is different
*/
package Assignment;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading obj=new Methodoverloading();
		
		int x=Methodoverloading.multi(12, 25);
		System.out.println("multiplication of two integer no. "+x);
		
		obj.multi(10, 23.1f);
		
		int p=Methodoverloading.division(50, 5);
		System.out.println("division of 2 integer no. " +p);
		
		obj.division(60.8, 2);

	}
    public static int multi(int a, int b) {
    	int c=a*b;
    	return c;
    }
    public void multi(int a,float b){
    	float c=a*b;
    	System.out.println("multipication of int and float datatype "+c);
    }
    public static int division(int a,int b){
    	int d=a/b;
    	return d;
    }
     private void division(double a,int b){
    	 double d=a/b;
    	 System.out.println("division of  double and int datatype "+d);
     }
}

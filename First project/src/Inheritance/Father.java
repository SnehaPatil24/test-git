package Inheritance;

//Multilevel Inheritance 

//First Class -GrandFather
class GrandFather{
	
	public void Car() {
		
	}
	
	public static void main(String[] args) {
		System.out.println("I am from GrandFather");

	}
	
}
//Father class is extending the GrandFather Class
public class Father extends GrandFather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am from Father");

	}
}

//Child class is extending the Father Class 
class Child extends Father{
		
}


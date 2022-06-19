package overriding;
public class Parent3 {
	
	public void Bike() {
		
		System.out.println("I am parent class Bike");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
	class Child extends Parent3{ // child (sub class is extending parent (super class)
		
		//method overriding nothing but a mechanism to provide specific implementation of a method which is provided 
		//by super class
		public void Bike() {
			
			System.out.println("I am child class Bike");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Child obj=new Child();
			obj.Bike();
		}
	}


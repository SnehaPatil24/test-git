package Inheritance;

//Multiple inheritance is not possible through class as it will create method ambiguity 

//In below example you have two class Vehicle and Car having same method Speed()
//If another class MultipleInheritance try to extend Vehicle and Car class 
//then java will not understand from which class Speed method need to call
//which leads to method ambiguity that's why multiple inheritance is not possible through class
class Vehicle{
	
	public void Speed() {
	
		System.out.println("I am from Vehicle Class");
	}
}

class Car{

	public void Speed(int a) {
		System.out.println("I am from Car Class");
	}
	
	public void Speed() {
		
		System.out.println("I am from Vehicle Class");
	}
}

//MultipleInheritance class only can extend Vehile but not both class 
public class MultipleInheritance extends Vehicle{
	
	public void CarType(){
		System.out.println("Honda City");
	}
	
	public static void main(String[] args) {
		MultipleInheritance obj=new MultipleInheritance();
		obj.Speed();
		obj.CarType();
	}

}
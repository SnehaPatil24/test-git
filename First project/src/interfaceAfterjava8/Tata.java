package interfaceAfterjava8;

//if we have default method class doesn't need to implement 
interface FourWheeler {

	//method which need to implement by class -Tata 
	public abstract void Design();
	
	//Method which is common to all classes
	//whenever you want to implment any method in interface either it is default/static
	//default method 
	public default void noofwheels() {
		System.out.println("Vehicle is consider as four wheeler");
	}
}

//when we implement java ask to you implement unimplemented(abstract)
public class Tata implements FourWheeler{

	public void Design() {
		System.out.println("This is Tata design");
		
	}
	
	public static void main(String[] args) {
		Tata vehicle=new Tata();
		vehicle.Design();
		vehicle.noofwheels();
	}
	
}

class Honda implements FourWheeler{

	
	public void Design() {
		// TODO Auto-generated method stub
		
	}
	
}
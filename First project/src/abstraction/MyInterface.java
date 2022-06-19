package abstraction;

public interface MyInterface {
	//by default each and every variable will be constant in interface
	// if you don't add final keyword then compiler will add it
	final int a=12; 
	int  b=2; 
    //whenever you have only method declaration
	// It is not mandatory to write abstract keyword in interface
    //if you don't write compiler will add abstract keyword
	public void firstmethod();  //after compilation public abstract void firstmethod();
	
	//can we create object of abstract class---->no.
	//can we create object of interface--->no.
	
	//can abstract class have instance variable---->yes
	//can interface have instance variable--->yes but each and every variable will final
	
	//can abstract class have normal method-->yes
	//can interface have normal method-->no  
	
	//can abstract class have constructor-->yes
	//can interface have constructor-->no  
	
	//can we have private abstract method in abstract class---->no
	//can we have private abstract method in interface---->no
	
	//each and every method will be by default--->public
	//you cannot use other than public 
	//public abstract 
	
}

package myFirstPackege;

public class Home {
	public int food; //instance variable
	//variable declaration
	public static int refrigerator;//static variable
	
	//Global Variable->A variable which is defined inside the class and outside the method 
	//Global variable is of two type -instance variable/static variable
	//Static Variable- When we want single copy across the object
	//Static variable -A variable which is defined inside the class and outside the method with static keyword
	//Instance variable-->A variable which is defined inside the class and outside method without static keyword
	
	//class Area outside the method  

	public static void main(String[] args) {
	  // method area
		//Local -A variable which is defined inside the method
		int bed; //local variable
		
		//Object creation 
		//Classname objectname=new Classname();
		Home personone=new Home();
		Home persontwo=new Home();
		Home personthree=new Home();
		Home personfour=new Home();
		Home personfive=new Home();
		
		System.out.println(personone.refrigerator);
		//variable intialization 
		persontwo.refrigerator=25;
		System.out.println("This is change value "+personone.refrigerator);
		System.out.println(personthree.refrigerator);
		personfour.refrigerator=100;
		System.out.println(persontwo.refrigerator);
		
	}
}

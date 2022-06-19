package Inheritance;

public class PackageThreeClass extends PackageTwoClass {
	

	public void M5() {
		System.out.println("I am PackageThreeClass class M5");
	}

	public static void main(String[] args) {
		PackageThreeClass obj=new PackageThreeClass();
		obj.M5(); // it will called child class method 
		
	}
}

//parent has more than one child
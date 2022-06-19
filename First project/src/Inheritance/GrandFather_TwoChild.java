package Inheritance;
//Hierarchical inheritance - It means one class is extended by more than one class
public class GrandFather_TwoChild {
	
	public void M1() {
		System.out.println("I am from GrandFather method");
	}

}

//FatherNew Class is extending the GrandFather_TwoChild
class FatherNew extends GrandFather_TwoChild{
	
}

//Kaka class is extending the GrandFather_TwoChild
class kaka1 extends GrandFather_TwoChild{
	
	
}
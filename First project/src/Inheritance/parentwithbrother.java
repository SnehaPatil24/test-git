package Inheritance;

//Below is example of Hierarchical inheritance 
//GrandFatherClass is parent class
class GrandFatherClass {
	
	public void GrandFatherMethod() {
		
		System.out.println("I am grand father");
	}

}

//parentwithbrother is extending the GrandFatherClass  parent class
public class parentwithbrother extends GrandFatherClass{

	//parentwithbrother class specific method 
	public void ParentMethod() {
		System.out.println("I am parent class method");
	}
	
	public static void main(String[] args) {
		parentwithbrother obj=new parentwithbrother();
		obj.GrandFatherMethod();// child class object is accessing parent class method 
		obj.ParentMethod();
		//obj.KakaMethod();
		
	}
	
}

//parentwithbrother not extending the GrandFatherClass but also kaka class as well
class kaka extends GrandFatherClass{
	
	// kaka class specific method 
	public void KakaMethod() {
		System.out.println("I am kaka class method");
	}
	
	public static void main(String[] args) {
		
		kaka obj=new kaka();
		obj.GrandFatherMethod(); // child class object is accessing parent class method 
		obj.KakaMethod();
		
	}
	
}
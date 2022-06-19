package overriding;

 class A
 {
	 //return type is A
	 //A is nothing but class
	 //whenever you return class object or
	 //you use class object at variable it is called non-primitive datatype
	 public A M1()
	 {
		System.out.println("I am in parent class method M1");
		 A obj=new A();
		 return obj;
		 //return this;
	}
	 public A M2()
	 {
		System.out.println("I am in parent class method M2");
		 A obj=new A();
		 return obj;
		 //return this;
	}
 }
  
public class C extends A{
	//In non-primitive you can have same return type as parent class
	//JAVA 5-in non-primiive you acn also have return type as child class object
		
	public C M1()
	 {    
		System.out.println("I am in child class method M1");
		C obj=new C();
		 return obj;
		 //return this;
	}
	public A M2()
	 {
		System.out.println("I am in child class method M2");
		 A obj=new A();
		 return obj;
		 //return this;
	}
	public static void main(String[] args) {
            
		A t=new A();
		t.M1();//parent class
		t.M2();
		C c=new C();
		c.M1();//child class
		c.M2();
		A a=new C();
		a.M1();//child class
		a.M2();

	}

}

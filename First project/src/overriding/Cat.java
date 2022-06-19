package overriding;

//Method Overriding 
//Rule 1- There should be parent child relation- in this Animal class is extended by Dog and Cat
//Rule 2- Method signature should be same in this Sound method signature is same in child class
//Rule 3- Access modifier should be same or not be more restrictive in this sound has same access modifier in child class as parent 
//Rule 4 - If return type is primitive then it should be same as sound method is having return type is void then child class should be same 
class Animal {
	
	//Sound method is having public access modifier with void return type
	public void Sound() {
		System.out.println("No Sound");
	}
	
	/*
	 * private Sound() { //within method overloading return type doesn't play any
	 * role System.out.println("No Sound"); }
	 */
	
	public void sleep() {
		System.out.println("I am from parent class");
	}
}	
//AccessModifier - private default,protected public 
	class Dog extends Animal{
		
		//Dog class is overriding the Sound method 
		//Access modifier should be same or more accessible modifier than parent class
		//Return type should be same as parent class 
		//Method signature is same 
		public void Sound() {// Overide - complition error if return type is mismatch
			System.out.println("Bark Bark");
			
		}
		
		
	}
	
	public	class Cat extends Animal {
		
		//Cat class is overriding the Sound method 
		//Access modifier should be same or more accessible modifier than parent class
		//Return type should be same as parent class 
		//Method signature is same 
		public void Sound() {
			System.out.println("Meaw");
		}
		
		public static void main(String[] args) {
			Cat obj=new Cat();
			obj.Sound(); // it will call sound method from cat class
			Dog obj1=new Dog();
			obj1.Sound(); // it will call sound method from dog class
			
			
		}
	}


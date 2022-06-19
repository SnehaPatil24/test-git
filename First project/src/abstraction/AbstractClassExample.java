package abstraction;

public abstract class AbstractClassExample {
	//Variable Declaration
		int a;
		int b=5; //declaration +implementation 

		//Method Declaration 
		//When you want only method declaration but not the implementation
		//then with the class it is mandatory to make that method as abstract
		//if you don't make abstract it will show compilation error 
		public  abstract void M1();
		
		public static void main(String[] args) {
			
			//As AbstractClassExample is not a normal class it is abstract class
			//in that case you can't create object of that class
			//AbstractClassExample obj=new AbstractClassExample();
			//obj.M1();// It avoid such type of confusion java don't allow to create object of abstract class

		}

}

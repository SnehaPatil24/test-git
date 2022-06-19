package Interface;

interface NewInterface  {
	//<acces_modifier> <non_accessModifier> datatype variablename
		// whether variable is accessible within class/package or outside package
		//static/non static --it will decide whether you will have separate copy for each object or not 
		// class level variable ---but don't want to modify 
		
		//each and every variable will be final
		//final variable is nothing but constant so initialization mandatory
		final int a=10;  //static final int a=10
		//by default variable will be also have public access modifier
		
		int b=25; //public static final int b=25;
		//we can initialized final variable by two
			//A. At the time of declaration
			//B. Within the constructor
			//C. 
		
		// Access Modifier -which modify your access
		
		
		//Each and every method in interface is by default abstract
		//writing abstract keyword is optional
		public void Login();
		public abstract void Payment();
		
		//Within interface each and every method is by default public abstract
		void CashWithdraw();//----> public abstract void M3()
		public void PaymentWithIMPS();
		public void CommonMessage();
		
		
	}




	//Instead of implementing the interface directly in each class
	// we create one base class which is called as utility class like below

	public abstract class BaseClass implements NewInterface {

		
		public void PaymentWithIMPS() {
			
		}
		
		public void CommonMessage() {
			System.out.println("ATM charges is revised ");
		}
	}

	// Instead of directly implementing th interface we added baseclass
	// All the child class will extend the Baseclass like this 
	//So if any new method is added in interface its implementation only need to add in baseclass 
	class MobileApp extends BaseClass{

		@Override
		public void Login() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void Payment() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void CashWithdraw() {
			// TODO Auto-generated method stub
			
		}
		
	}

	// Same like MobileApp webapp also extended the base class
	class WebApp extends BaseClass{

		@Override
		public void Login() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void Payment() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void CashWithdraw() {
			// TODO Auto-generated method stub
			
		}
}

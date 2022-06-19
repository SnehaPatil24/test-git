package Inheritance;

public class PackageOneClass {
	//everywhere
		public void M1() {
			System.out.println("I am M1 method");
		}
		
		//within package and outside package if parent child relation
		protected void M2() {
			System.out.println("I am M2 method");
		}
		
	//within package
		void M3() {
			System.out.println("I am M3 method");
		}
		
		//within class
		private void M4() {
			System.out.println("I am M4 metho");
		}
		
		//compiler will add default constructor if not constructor
		
		public PackageOneClass(int a) {
			System.out.println("I am parent class constructor");
		}

		
	}


package Inheritance;

import constructors.thisKeyword;

//There is class NoInhertiance calling another class method without extending that class
public class NoInhertiance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisKeyword obj=new thisKeyword();
		//obj.M1();  You cant access as it is protected
		//obj.a;
	}

}
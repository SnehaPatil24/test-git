package Casting;

import java.util.Arrays;

import overriding.MethodOverridingAtRuntime;

class lowerclass{
int a=6;
public void m1() {
	System.out.println("i am m1");
}
}
public class ExplicitCasting extends lowerclass{
	public void m2() {
		System.out.println(" i am m2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lowerclass a=new lowerclass();
		ExplicitCasting a1=new ExplicitCasting();
		lowerclass a2=new ExplicitCasting();
		ExplicitCasting a3= (ExplicitCasting) a1;
		a3.m1();
		
		a3.m2();
	}

}
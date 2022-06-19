package MethodOverloading;

public class Test {
	public static void main(String[] args) {
		AddwithoutmethodOverloading obj=new AddwithoutmethodOverloading();
		double e=obj.add2(12,34);
		System.out.println("addition is  " +e);
		CallingFromAnotherClass.Add1(54,78);
		
	}
}

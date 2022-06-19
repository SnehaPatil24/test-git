//Create the class having two constructor one with no parameter and another with single parameter.
//Write print statement in both constructor for differentiation

package Assignment;

public class ConstructorAssignment {

	public static void main(String[] args) {
		ConstructorAssignment obj= new ConstructorAssignment(12);
		ConstructorAssignment obj1= new ConstructorAssignment();
	}
	//constructor having one parameter
	ConstructorAssignment(int a)
	{
		System.out.println("I am in parameterized Constructor");
	}
	//constructor having no parameter
	public ConstructorAssignment()
	{
		System.out.println("I am in no parameterized Constructor");
	}
}

package Casting;

public class ChildClass  extends ParentClass{
public static void main(String[] args) {
	ParentClass obj=new ParentClass();
	ChildClass obj1=new ChildClass();
	//LHS!=RHS
	//type casting---->Implicit casting---->non primitive
	ParentClass obj2=new ChildClass();
	ChildClass o=(ChildClass) obj2;
	System.out.println();
}
}

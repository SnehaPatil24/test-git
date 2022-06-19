package overriding;
//final class helps to make sure that it will not get inherited
final class parent
{
	public void M1() {
		System.out.println("I am from parent");
	}
}

//you cannot extends the class whose name is parent as it is final class
//public class FinalClass_Example extends parent
public class FinalClass_Example {

	public static void main(String[] args) {
	
	}

}

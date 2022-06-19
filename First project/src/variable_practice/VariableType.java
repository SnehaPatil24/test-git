package variable_practice;

public class VariableType {
	//<Access_Modifier><DataType><Identifier>;
	 // it is declare with in the class and outside the method
	// without static keyword
	public int Food;
	//It is declare within the class and outside the method
	//with static keyword
	//Static variable is also called class level variable
   public static int Refrigrator; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Which is written inside the method and you can't write access modifier
		//<data_type> <Variable_Name>;
		int a; //local variable
		//First Object
		VariableType dhananjay=new VariableType();
		//Second Object
		VariableType Shubham=new VariableType();
		//Static Variable ---It will be single copy for all object
		System.out.println("Static variable Value " + VariableType.Refrigrator);
		//Yellow warning represent that if you want to call static variable
		//please use class name instead object name
		System.out.println("Static variable Value " + Shubham.Refrigrator);
		dhananjay.Refrigrator=35;
		System.out.println("Static variable Value for Dhananjay " + dhananjay.Refrigrator);
		System.out.println("Static variable Value is changed for shubham as well " + Shubham.Refrigrator);
		
		
		//instance variable default value
		System.out.println("Food instance variable value for Dhananjay " + dhananjay.Food);
		System.out.println("Food instance variable value for shubham " + Shubham.Food);
		dhananjay.Food=10;
		//As food is instance variable , value will be only change for Dhananjay but not for shubham
		System.out.println("Food instance variable value for Dhananjay " + dhananjay.Food);
		System.out.println("Food instance variable value for shubham " + Shubham.Food);
		
		//Local Variable is mandatory to initilize before use;
		a=10;
		System.out.println(a); //if try to use before initilization you will get error
	}

}

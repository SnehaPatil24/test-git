/*Create simple calculator
(switch statement support, addition,multiplication and other operations)  
*/
package Assignment;

public class Switch_calculator {
	int a=20;
	int b=5;
	int ch=3;
	
	public static void main(String[] args) {
		Switch_calculator obj=new Switch_calculator();
	
		//int a=20;
		//int b=5;
		double result;
		switch(obj.ch)
		{
		case 1:
		   result=obj.a+obj.b;
		   System.out.println("additoin is "+result);
		   break;
		case 2:
			result=obj.a-obj.b;
			System.out.println("substraction is "+result);
			break;
		case 3:	
			result=obj.a*obj.b;
			System.out.println("multipication is "+result);
			break;
		case 4:
			result=obj.a/obj.b;;
			System.out.println("division is "+result);
			break;
		case 5:
			result=obj.a%obj.b;;
			System.out.println("module is "+result);
			break;
		default:
			System.out.println("put proper value");
			break;
		}
		
	}

}

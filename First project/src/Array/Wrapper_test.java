package Array;

public class Wrapper_test {
    
	public static void main(String[] args) {
		//there is one class as integer for int data type
		//2 primitive value is convert into object
		Integer obj=new Integer(2);
		//it will print int value
		System.out.println(obj.intValue());//2
		
        //it will print double value
		System.out.println(obj.doubleValue());//2.0
		
		//I am converting string into integer
		System.out.println(obj.parseInt("23"));
		
		/*  System.out.println(obj.parseInt("abc"));---->parseInt takes one 
		parameter as string value so there is chance of 
		throwing numberformatException  */
		
		Float test=new Float(4);
		System.out.println(test.floatValue());
		System.out.println(test.parseFloat("23"));
		
		/*if we are taking string and converting into respective data type
		  double----parsexxxx() parseInt
		  double----parsedouble(String t)
		  xxxvalue--->intvalue
		  int to double---->doublevalue  */
		
		//whenever we want to convert string into primitivr data--->parsexxx()
		/*  whenever we want to convert one primitive datatype 
		into another--->xxxvalue()  */
		
	}
}

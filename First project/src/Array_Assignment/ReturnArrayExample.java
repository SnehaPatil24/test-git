//2. Return Array from a method
package Array_Assignment;

public class ReturnArrayExample {
     public static int []arr(){
    	 int []a= {2,6,5,9,12,32,65};
    	 return a;
    	 
     }
	public static void main(String[] args) {
		
		int []b=arr();
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+",");
		}
		System.out.println("");
		//using for each loop
		System.out.println("using for each loop");
		for(int i:b)
		{
			System.out.print(i+",");
		}

	}

}

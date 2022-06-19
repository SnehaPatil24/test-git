//5. Check whether number is prime or not
package Assignment;

public class PrimeNoUsingFor {
	public static void main(String[] args) {

     int n=3;
     int flag=0;
     
     if(n==0 || n==1)
     {
    	 System.out.println(n+"is not prime");
     }
     else
     {
    	 for(int i=2;i<=n/2;i++)
    	 {
    		 if(n%i==0)
    		 {
    			 System.out.println(n+"is not prime");
    			 flag=1;
    			 break;
    		 }
    		 
    	 }
    	 if(flag==0)
    	 {
    		 System.out.println(n+"is  prime");
    	 }
     }
}
}


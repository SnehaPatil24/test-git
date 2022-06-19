package Array;

public class LifeWithoutArray {
      int roll;//variable declaration
      static int[] rno;//array declaration
      //variable at the max can store only one variable
      //array can store n no. value only thing is you need to define
      //array always fixed in size
      
      public static void main(String[] args) {
		
    	  /*before initilazation we cannot take any value
    	  if we try to do it then NullPointerException occurs
    	  //System.out.println(rno[0]);-------->NullPointerException*/
    	  //initialization 
    	  rno=new int [100];
    	  //data type [] variable name=new data type[size]
    	  rno[0]=12;//assigning value to variable
    	  
    	  System.out.println(rno[0]);
    	  System.out.println(rno[1]);//default value is show
    	  //ArrayIndexOutOfBoundsException
    	  //System.out.println(rno[100]);//if array size is 100 then index=size-1=99

      }
}
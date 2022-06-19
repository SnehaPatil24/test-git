package Array;

public class Array_appproachs {
     //declaration of array
	static int []arrayname;//primitive datatype
    //approach 2-where declaration and initialization happens in one line
     int[] newarray= {1,2,3,4,5,6};
     static char [] test;
     
	public static void main(String[] args) {
	  
	  //Initialization
	  arrayname=new int [10];//non primitive datatype uses new keyword
	  Array_appproachs obj=new Array_appproachs();
	  System.out.println(obj.newarray[4]);
	   test = new char[10];
	   test[0]='a';//it will convert primitive into non primitive character
	   //test[0]=new character('a');--->autoboxing
	   test[1]=new Character('b');//Explicitly convert primitive into non primitive
	  
	  /* array is collection of homogeneous data type 
	   * when we initialize--->new keyword use*/
}
}

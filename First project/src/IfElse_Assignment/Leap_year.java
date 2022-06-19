package IfElse_Assignment;

public class Leap_year {
  public static void main(String[] args) {
	  Leap_year.leap(2018);
}
     public static void leap(int a)
     {
    	 if(a%4==0)
    	 {
    		 System.out.println("leap year");
    	 }
    	 else if(a%100==0)
    	 {
    		 System.out.println("leap year");
    	 }
    	 else if(a%400==0)
    	 {
    		 System.out.println("leap year");
    	 }
    	 else
    	 {
    		 System.out.println("not leap year");
    	 }
     }
}

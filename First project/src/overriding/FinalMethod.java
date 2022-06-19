package overriding;
   class finalPrent
   {
	   //method with public access modifier
	   public void Home()
	   {
		   System.out.println("I can Override");
	   }
	 //method with private access modifier
      private void locker()
      {
    	  System.out.println("I am Private Method");
      }
    //method with final keyword
      public final void AncestorProperty()
      {
    	  System.out.println("I am with Final");
      }
   }
public class FinalMethod extends finalPrent{

	public static void main(String[] args) {
		
		FinalMethod child=new FinalMethod();
	//	child.AncestorProperty();
	  child.Home();
	}
	 public void Home()
	   {
		   System.out.println("I am rebuilding it");
	   }
	 //you cannot override AncestorProperty() method as it is final in parent class
}

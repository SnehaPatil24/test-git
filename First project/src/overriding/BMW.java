package overriding;
  

   //rule 1-it should have parent child relation
   //rule 2-same method and same signature 
public class BMW extends FourWheeler{
     
	public static void main(String[] args) {
		//parent class reference and parent class object
		FourWheeler p=new FourWheeler();
		p.speed();//parent class method
		
		//child class reference and child class object
		BMW c=new BMW();
		c.speed(); //child class method
		//we are creating child class object
		//but referring to parent class
		
		//parent class reference and child class object
		FourWheeler test=new BMW();
		//method binding happens at runtime-runtime polymorphism
		test.speed();//it will call child class
		
		//child class reference pointing to parent class object
		//BMW t=new FourWheeler();
		
		
	}
	public void speed()
    {
	  System.out.println("I have 2000 cc ");
    }
	//rule -parent class - yes BMW is child and fourwheeler is parent
	//rule - method signature is same
	//rule - return type should same as parent
	public int Gear(){
		return 6;
	}
}


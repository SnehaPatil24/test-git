package method_practic;
//this program is to explain different types of method
//there are twotype of method 1.static 2 nonstatic(instance)
// static method also called class level method
//non static method is also called object level/instance method
public class MethodTypes {
    public static void main(String[] args) {
		// to call instance variable we need object of class 
    	//class name is MethodType so we will create object of it
    	MethodTypes obj=new MethodTypes();
    	
    	//my instance method id InstanceMethdName so to call instance method we use object
    	obj.InstanceMethodName();//method calling
    	MethodTypes.StaticMethodName();
    	//to call static method we don't need object
    	//we can directly call by classname.methodname();
    	
	}
    //create instance method -it means without static keyword
    //access modifier-private
    //return type-void
    //method name-InstanceMethodName
    //parameter -zero
    
    private void InstanceMethodName()
    {
    	System.out.println("i am instance method");
    }
    
  //create static method -it means with static keyword
    //access modifier-protected
    //return type-void
    //method name-StaticMethodName
    //parameter -zero
    private static void StaticMethodName()
    {
    	System.out.println("i am static method");
    }
    
}

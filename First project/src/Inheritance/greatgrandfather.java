package Inheritance;

//Below is example of multi-level inheritance where more than two class is extended  
//greatgrandfather class is parent of all the class
public class greatgrandfather{
	
	
}

//grandfather class is extending greatgrandfather class
class grandfather1 extends greatgrandfather{
	
	
}

//Multiparent is extending the grandfather class
class multiparent extends grandfather1{
	
	
}

class multilevel extends multiparent {

}


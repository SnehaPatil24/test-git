package MethodOverloading;

public class MethodOverLoadingWithDifferentModifer {
	//Access Modifier doesn't play any role in method overloading
		// If we try to have different access modifier with same signature
		//You will get duplicate method error 
			public void Add() {
			
			
			}
		
			private void Addq() {
			
			}

			//Return type doesn't play any role in method overloading
			// If we try to have different return type with same signature
			//You will get duplicate method error 
			
			//Access Modifier - public 
			//Return Type- void
			//Method Name- Add
			//No of parameter-Two one with int 
			//Method Signature- Add(int a)
				public void Add(int a) {
				
				
				}
			
				//Access Modifier - public 
				//Return Type- int
				//Method Name- Add
				//No of parameter-Two one with int 
				//Method Signature- Add(int a)
				public int Add(float b) {
					return 0;
					
				}
}

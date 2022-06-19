//Largest Number in Array
package Array_Assignment;

public class LargeNoFromArray {

	public static void main(String[] args) {
		int[] arr = {23,65,45,98,29};
		
		int largest = arr[0]; 
		for (int i = 1; i < arr.length; i++) {
			if (largest < arr[i])
			{
				largest = arr[i];
			}
		}
		System.out.println("largest element is " + largest);
	
		/* int[] arr = {23,65,45,98,29};
	     int temp;	
		for (int i = 0; i <arr.length; i++)   
        {  
            for (int j = i + 1; j <arr.length; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
                System.out.println("largest element is " +arr[i]);
            }  
        }  */
		
       
}  
	}


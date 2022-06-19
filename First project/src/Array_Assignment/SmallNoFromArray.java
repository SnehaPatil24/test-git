//13 Smallest Number in Array
package Array_Assignment;

public class SmallNoFromArray {
	
	public static void main(String[] args) {
		int[] arr = {23,65,45,98,29};
		
		int smallest = arr[0]; 
		for (int i = 1; i < arr.length; i++) {
			if (smallest > arr[i])
			{
				smallest = arr[i];
			}
		}
		System.out.println("smallest element is " + smallest);
	}	

}
	
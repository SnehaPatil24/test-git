import java.util.Arrays;

import systemPackage.system_example1;

public class mock_question {
  public static void main(String[] args) {
	int arr[]= {98,2,4,9,7,8,45,54,76,23};
	
	//System.out.println(Arrays.toString(arr));
    int min=0;
    int max=0;
    
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
   min=arr[0];
   max=arr[arr.length-1];
   System.out.println("min = "+min);
   System.out.println("max = "+max);
}
}

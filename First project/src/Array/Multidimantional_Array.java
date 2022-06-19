package Array;

public class Multidimantional_Array {
      public static void main(String[] args) {
		int [] a;
		int [][] b;
		
		//initilization of single dimensional array
		a=new int [10];
		
		//initilization of two dimensional array
		b=new int [2][2];//first dimension * second = 2*2 = 4
		b[0][0]=1;
		b[0][1]=2;
		b[1][0]=3;
		b[1][1]=4;
		
		
		//nested for loop
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.println(b[i][j]);//b[0][0] //b[0][1]  //b[1][1]  //b[1][1]
			}
		}
		System.out.println("-------------------------");
		int[][] T=new int[4][2];
		System.out.println("array length "+T.length);
		for(int i=0;i<T.length;i++)
		{
			for(int j=0;j<T[i].length;j++)
			{   
				System.out.println("value of i ="+i);
				System.out.println("value of j ="+j);
				System.out.println(T[i][j]);
			}
		}
		
	}
}

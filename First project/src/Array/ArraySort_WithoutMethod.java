package Array;

public class ArraySort_WithoutMethod {
    public static void main(String[] args) {
		int []a=new int[]{5,3,7,2,1,6,9,0};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=0;
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
							
				}
			}
			System.out.println(a[i]);
		}
}
}

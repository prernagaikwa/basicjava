import java.util.*;
class order
{
	public static void main(String[] args)
	{
		int[] a=new int [5];
		int i,j;
		int temp;
		int n=5;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
			for (i = 0; i < n - 1; i++)
			{  
   				 for (j = 0; j < n - i - 1; j++)
  			 	{  
      					if (a[j] > a[j + 1]) 
					{  
       					 	temp = a[j];  
       	 					a[j] = a[j + 1];  
       	 					a[j + 1] = temp;  
					}
   				}
			}
		System.out.println("Sort array is");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}

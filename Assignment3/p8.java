class p8
{
	public static void main(String [] args)
	{
		int  [] a = {5,4,3,2,1};
		
		for(int i = 0;i<a.length;i++)
		{
			for(int k = 5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j = 0;j<=i;j++)
			{
				System.out.print(a[i-j]+" ");
			}
			System.out.println();
		}
	}
}

/*
Output:
E:\CDAC - JUHU\Assignment3>java p8
      5
     4 5
    3 4 5
   2 3 4 5
  1 2 3 4 5
*/
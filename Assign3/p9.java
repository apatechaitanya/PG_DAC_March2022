class p9
{
	public static void main(String [] args)
	{
		char [] a = {'A','B','C','D','E'};
		
		for(int i = 0;i<a.length;i++)
		{
			for(int k = 5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j = 0;j<=i;j++)
			{
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
	}
}

/*
Output:
E:\CDAC - JUHU\Assignment3>java p9
      A
     A B
    A B C
   A B C D
  A B C D E  
*/
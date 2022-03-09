class p11
{
	public static void main(String [] args)
	{
		for(int i =0;i<=4;i++)
		{
			for(int k = 5;k>=i;k--)
			{
				System.out.print(" ");
			}
			
			for(int j = 1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(int c = 0;c<=i;c++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}

/*
Output:
E:\CDAC - JUHU\Assignment3>java p11
      *
     ***
    *****
   *******
  *********
*/
class p6
{
	public static void main(String [] args)
	{
		for(int i = 1;i<=5;i++)
		{
			for(int j =4;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int l = 1;l<=i;l++)
			{
				System.out.print(" *");
			}
			System.out.println();
			
		}
	}
}

/*
Output:
E:\CDAC - JUHU\Assignment3>java p6
    *
   **
  ***
 ****
*****

E:\CDAC - JUHU\Assignment3>
*/
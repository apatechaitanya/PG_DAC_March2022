class p7
{
	public static void main(String [] args)
	{
		for(int i = 1;i<=5;i++)
		{
			for(int j =5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}

/*

Output:

E:\CDAC - JUHU\Assignment3>java p7
     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5
 
*/
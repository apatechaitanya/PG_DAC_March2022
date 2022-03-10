class p47
{
	public static void main(String [] args)
	{
		for(int i = 0;i<=6;i++)
		{
			for(int k = 1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j = 6;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*
Output:
E:\CDAC - JUHU\Assignment2>java p47
* * * * * * *
 * * * * * *
  * * * * *
   * * * *
    * * *
     * *
      *
*/
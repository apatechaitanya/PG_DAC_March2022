class p46 
{
	public static void main(String [] args)
	{
		for(int i = 0;i<=6;i++)
		{
			for(int k = 5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j = 0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*
Output:
E:\CDAC - JUHU\Assignment2>java p46
      *
     * *
    * * *
   * * * *
  * * * * *
 * * * * * *
* * * * * * *
*/
class p24
{
	public static void main(String [] args)
	{
		for(int i =1;i<=6;i++)
		{
			for(int k = 1;k<=i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j = 5;j>=i;j--)
			{
				System.out.print("*");
			}
			
			for(int c = 6;c>=i;c--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
/*
Output:
E:\CDAC - JUHU\Assignment3>java p24
 ***********
  *********
   *******
    *****
     ***
      *
	  
*/
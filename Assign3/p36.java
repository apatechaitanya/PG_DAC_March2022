class p36
{
	public static void main(String [] args)
	{
		for(int i = 1;i<=9;i++)
		{
			for(int j = 9;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
/*
Output:
E:\CDAC - JUHU\Assignment3>java p36
         1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5
    1 2 3 4 5 6
   1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9
*/
class p38
{
	public static void main(String [] args)
	{
		for(int i = 1;i<=9;i++)
		{
			for(int j = 9;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int l = 1;l<=i;l++)
			{
				System.out.print(l+" ");
			}
			for(int k = 2;k<=i;k++)
			{
				System.out.print(i-k+1+" ");
			}
			System.out.println();
		}
	}
}
/*
Output:
E:\CDAC - JUHU\Assignment3>java p38
                  1
                1 2 1
              1 2 3 2 1
            1 2 3 4 3 2 1
          1 2 3 4 5 4 3 2 1
        1 2 3 4 5 6 5 4 3 2 1
      1 2 3 4 5 6 7 6 5 4 3 2 1
    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
*/
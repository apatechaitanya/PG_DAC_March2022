class p41
{
	public static void main(String [] args)
	{
		int c = 9;
		for(int i = 1;i<=9;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k = 9;k>=i;k--)
			{
				System.out.print(c+" ");
			}
			c-=1;
			System.out.println();
		}
	}
}
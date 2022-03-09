class p39
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
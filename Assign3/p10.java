class p10
{
	public static void main(String [] args)
	{
		char [] a = {'E','D','C','B','A'};
		
		for(int i = 0;i<a.length;i++)
		{
			for(int k = 5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j = 0;j<=i;j++)
			{
				System.out.print(a[i-j]+" ");
			}
			System.out.println();
		}
	}
}
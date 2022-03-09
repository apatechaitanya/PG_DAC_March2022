class p18
{
	public static void main(String[] args)
	{
		char [] a = {'A','B','C','D','E'};
		for(int i = 4;i>=0;i--)
		{
			for(int j = 0;j<=i;j++)
			{
			System.out.print(a[j]+" ");
			}
			System.out.println();
		}
	}
}

/*
Output:
E:\CDAC - JUHU\Assignment3>java p18
A B C D E
A B C D
A B C
A B
A
*/
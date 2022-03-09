class p5
{
	public static void main(String [] args)
	{
		char [] a = {'A','B','C','D','E'};
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<=i;j++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}
}

/*
Output:

E:\CDAC - JUHU\Assignment3>java p5
A
B B
C C C
D D D D
E E E E E

E:\CDAC - JUHU\Assignment3>

*/
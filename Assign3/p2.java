class p2
{
	public static void main(String [] args)
	{
		char [] a = {'A','B','C','D','E'};
		
		for(int i = 0;i<a.length;i++)
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

Output :
E:\CDAC - JUHU\Assignment3>java p2
A
A B
A B C
A B C D
A B C D E

E:\CDAC - JUHU\Assignment3>

*/
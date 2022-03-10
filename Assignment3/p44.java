class p44
{
    public static void main(String[] args)
    {
		for(int i=6;i>0;i--)
        {
			if(i==1 || i==6)
            for(int j=1;j<=i;j++)
            {
				System.out.print("*");
			}
            else
			{
            for(int j=1;j<=i;j++)         
            {  
				if(j==1 || j==i)
					System.out.print("*");
                else
					System.out.print(" ");
            }
			}
            System.out.println();   
        }             
    }
}

/*
Output:
E:\CDAC - JUHU\Assignment2>java p44
******
*   *
*  *
* *
**
*


*/
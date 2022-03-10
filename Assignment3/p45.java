class p45 {

	public static void main(String[] args) { 
		for(int i=6;i>0;i--)
		{
		 for(int j=1;j<=6-i;j++)
		  System.out.print(" ");
		 if(i==1 || i==6)
		 for(int j=1;j<=i*2-1;j++)
		  System.out.print("*");
		else
		 for(int j=1;j<=i*2-1;j++)
		if(j==1 || j==i*2-1)
		  System.out.print("*");
		else
		  System.out.print(" ");
		System.out.println();
     }
  }
}
/*
E:\CDAC - JUHU\Assignment2>java p45
***********
 *       *
  *     *
   *   *
    * *
     *
*/
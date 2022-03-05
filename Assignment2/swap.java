import java.util.Scanner;
class swap
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number :");
		int b = sc.nextInt();
		System.out.println("Before swap A = "+a+" B = "+b);
		int temp = a;
		a = b;
		b  = temp;		
		System.out.println("After swap A = "+a+" B = "+b);
	}
}
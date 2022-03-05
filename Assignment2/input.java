
import java.util.Scanner;
class input
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int a ,b;
		System.out.println("Input first number :");
		a = sc.nextInt();
		System.out.println("Input second number :");
		b = sc.nextInt();
		System.out.println(a+" * "+b+" = "+a*b);
	}
}
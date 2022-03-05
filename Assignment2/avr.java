import java.util.Scanner;
class avr
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number :");
		int a = sc.nextInt();
		System.out.print("Enter the second number :");	
		int b = sc.nextInt();
		System.out.print("Enter the third number :");
		int c = sc.nextInt();
		
		double avg = (a+b+c)/3;
		System.out.println("Average = "+avg);
	}
}
import java.util.Scanner;
class PrimeNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = sc.nextInt();
		int temp = 0;
		for(int i =2;i<=a-1;i++)
		{
			if(a % i == 0)
			{
				temp = temp + 1;
			}
		}
		if (temp == 0)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}
}
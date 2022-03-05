import java.util.Scanner;
class Student {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Percentage : ");
		int a = sc.nextInt();
		if(100>=a && a>=90)
		{
			System.out.println("A grade");
		}
		else if(90>a && a>=80)
		{
			System.out.println("B grade");
		}
		else if(80>a && a>=70)
		{
			System.out.println("C grade");
		}
		else if(70>a && 60>=a)
		{
			System.out.println("D grade");
		}
		else
		{
			System.out.println("Invalid");
		}
		
    }
}

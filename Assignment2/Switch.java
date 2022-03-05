import java.util.Scanner;
class Switch
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vowel or consonent : ");
		char ch = sc.next().charAt(0);
		switch(ch){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
					System.out.println("Character is vowel");
					break;
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
					System.out.println("Character is vowel");
					break;
			default :
					System.out.println("Character is consonent");
		break;}
	}
}
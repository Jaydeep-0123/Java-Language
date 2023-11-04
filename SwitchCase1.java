import java.util.Scanner;
class Switch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a charecter");
		char ch=sc.next().charAt(0); // Read a character using next().charAt(0);

		switch(ch)
		{
		case 'j':
		System.out.println("you are jaydeep");
		break;

		case 'k':
		System.out.println("you are kuldeep");
		break;

		case 'n':
		System.out.println("you are nikhil");
		break;

		case 's':
		System.out.println("you are shivam");
		break;

		case 'g':
		System.out.println("you are gouatam");
		break;

		default:
		System.out.println("invalid choice");	
		}
	}
}
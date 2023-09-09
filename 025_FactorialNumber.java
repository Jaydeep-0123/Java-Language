import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{
		int i,sum=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		for(i=n;i>=1;i--)
		{
			sum=sum*i;
		}
		System.out.print(sum);
	}
}

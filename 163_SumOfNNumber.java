import java.util.Scanner;
class Sum
{
	public static void main(String[] args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++)
		{
            sum=sum+i;
		}
		System.out.print("the sum is = "+sum);

	}
}

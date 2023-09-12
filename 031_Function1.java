import java.util.Scanner;
public class Function1
{
	static void maxnumber(int a,int b)
	{
		if(a>b)
			System.out.println("the maximum number"+" "+a);
		else
			System.out.println("the maximum number"+" "+b);
	}


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();

		Function1.maxnumber(a,b);
	}
}

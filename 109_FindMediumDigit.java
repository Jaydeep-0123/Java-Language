import java.util.Scanner;
class Medium
{
	public static void main(String[] args)
	{
		int a,b,c;

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first number");
		a=sc.nextInt();
		System.out.println("enter a second number");
		b=sc.nextInt();
		System.out.println("enter a third number");
		c=sc.nextInt();

		if(a<b && a>c)
			System.out.println(a);
		else if(b<a && b>c)
			System.out.println(b);
		else
			System.out.println(c);
	}

}

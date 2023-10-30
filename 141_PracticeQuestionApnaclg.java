import java.util.Scanner;
class Average
{
	static void findAverage(int a , int b , int c)
	{
		int sum,avg;
		sum=a+b+c;
		avg=sum/3;
		System.out.println("The sum of Three Number :"+sum);
		System.out.println("The Average of Three Number :"+avg);
	}
}
class Apnaclg
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number :");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number :");
		int b=sc.nextInt();
		System.out.println("Enter the third Number :");
		int c=sc.nextInt();

		Average.findAverage(a,b,c); //function calling
	}
}



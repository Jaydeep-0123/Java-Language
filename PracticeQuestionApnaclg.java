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

//====================================================================================================



class OddNumber
{
	static void printOddNumber(int n)
	{
		/*for(int i=0;i<n;i++)
		{
			if(i%2!=0)
				System.out.println("The odd Number is : "+i+" ");
		}*/
		int i=0;
		while(i<n)
		{
			if(i%2!=0)
				System.out.println("The odd Number is : "+i);
			i++;
		}
	}
}
class Number
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();

		OddNumber.printOddNumber(n);
	}
}

//===============================================================================================



class Fibbonacci
{
	static void fibbonacciSeries(int n)
	{
       int first=0;
       int second=1;
       int sum;

       for(int i=0;i<n;i++)
       {
          sum=first+second;
          first=second;
          second=sum;

          System.out.print(sum+" ");
       }
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		fibbonacciSeries(n);
	}
}

//==============================================================================================



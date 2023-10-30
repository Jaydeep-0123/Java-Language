

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

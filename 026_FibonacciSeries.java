class Fibonacci
{
	public static void main(String[] args)
	{
		int first=0;
		int second=1;
		int sum=0;
        
        System.out.print(first+" "+second+" ");
		for(int i=1;i<=10;i++)
		{
            sum=first+second;
            first=second;
            second=sum;

            System.out.print(sum+" ");
		}
	}
}

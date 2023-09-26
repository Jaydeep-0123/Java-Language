class Prime
{
	public static void main(String[] args)
	{
		int n=6;
		int count=0;

		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
				System.out.print(n+" "+"is not prime");
                break;
			}
		}
		if(count==0)
			System.out.printf(n+" "+"is prime");
	}
}

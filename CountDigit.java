class CountDigit
{
	public static void main (String[] args)
	{
		int a=1234,c=0;
		int count = 0;

		while(a!=0)
		{
			c=a%10;
			a=a/10;
			count++;
		}	
		System.out.println(count);
	}
}
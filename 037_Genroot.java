class Genroot
{
	public static void main(String[] args)
	{
		int n=456,s=0,rem;
		while(n<=9)
		{
			rem=n%10;
			n=s+rem;
			n=n/10;
		}
		System.out.println(s+" "+"is Genric root");
	}
}

class perfect
{
	public static void main(String[] args)
	{
		int s=0,n=6;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{	
			s=s+i;
			}
		}
		if(n==s)
			System.out.println(n+"perfect");
        else
        	System.out.println(n+"not perfect");

	}
}

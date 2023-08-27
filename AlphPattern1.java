class Pattern
{
	public static void main(String[] args)
	{
		int i,j;

		for(i=1;i<=5;i++) //for row
		{
			for(j=1;j<=i;j++) //for coloum
			{
				System.out.printf("%c",j+64);
			}
			System.out.println();
		}
	}
}
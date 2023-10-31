class WithoutLoop
{
	static void printNo(int n)
	{
		if(n>0)
		{
			printNo(n-1);
			System.out.println(n+" ");
		}
	}

	public static void main(String[] args)
	{
      printNo(12);
	}
}


//==================================================================================================================


class Print
{
	public void loop(int n)
	{
		if(n>0)
		{
			loop(n-1);
		}
		System.out.print(n+" ");
	}
	public static void main(String[] args)
	{
		int n=20;
		Print p=new Print();
        p.loop(n);

	}
}

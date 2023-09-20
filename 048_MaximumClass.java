class Maximum
{
	private int a;
	private int b;  //member function and property
	private int c;

	Maximum(int a , int b , int c)   //constructur
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public int maximumNumber()
	{
		if(a>b && a>c)
			return a;
		else if(b>c && b>a)
			return b;
		else
			return c;
	}
}
class max
{
	public static void main(String[] args)
	{
		Maximum m2=new Maximum(20 , 30 , 50);
		int max = m2.maximumNumber();

		System.out.println("The maximum number is = "+max);
	}
}

class Maximum
{
	public int maximumNumber(int a,int b,int c)
	{
          if(a>b && a>c)
          	return a;
          else if(b>a && b>c)
          	return b; 
          	else
          		return c;
	}

	public static void main(String[] args)
	{
		Maximum m1=new Maximum();
		int max=m1.maximumNumber(10,20,30);
		System.out.println("The maximum number is = "+max);
	}
}
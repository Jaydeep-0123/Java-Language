class object
{
	public String toString()
	{
		return super.toString();
	}
	public static void main(String[] args)
	{
		object t=new object();
		object t1=new object();
		object t2=new object();
		object t3=new object();

		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2+" "+t3);
	}
}
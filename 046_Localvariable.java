class Local
{    
	 static int b=30;   //global variable
	public static void main(String[] args)
	{
		final int a=20;  //local variable
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
	}
}

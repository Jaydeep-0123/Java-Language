class Excp
{
	public static void main(String[] args)
	{
	System.out.println("main method start");
	int a=10;
	int b=0,c;

	try
	{
	c=a/b;
	System.out.println(c);
    }

    catch(ArithmeticException e)
    {
    	System.out.println("can not divide by Zero");
    }
    System.out.println("main method end");
    }

}
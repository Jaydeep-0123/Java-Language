public class FunctionSum
{
	static int sum(int a,int b)
	{
		int c = a+b;

		return c;
	}
	public static void main(String[] args)
	{
		int a=100;
		int b=200;
		System.out.println("the value of a"+" "+a);
		System.out.println("the value of b"+" "+b);

		int addition=sum(a,b);
		System.out.println("the sum of a and b"+" "+addition);
	}
}

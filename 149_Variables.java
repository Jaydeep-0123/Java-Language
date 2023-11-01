class A
{
	static int a=10;  //static Variable
	int b=20;   //Instance Variable

	public static void main(String[] args)
	{
		int c=30;   //Local Variable
		A a=new A();

		System.out.println(A.a);
		System.out.println(a.b);
		System.out.println(c);
	}
}

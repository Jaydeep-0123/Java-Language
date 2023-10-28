class A
{
	public void display(int x , int y)
	{
		System.out.println("The value of X :"+x);
		System.out.println("The value of y :"+y);
	}
	public void display(int x , float y)  //Method Overloading
	{
		System.out.println("The value of Z :"+x);
		System.out.println("The value of y :"+y);
	}
}
class Method
{
	public static void main(String[] args)
	{
		A a=new A();
		a.display(10,50);
		a.display(100,60);
	}
}	

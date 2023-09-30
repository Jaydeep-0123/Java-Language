class A     //parante class
{
	public A(int a)  //constructor
	{  
		super();
		System.out.println("A class No Constructor Argument :"+a);
	}
}
class B extends A   //child class
{
	public B()  //constructor
	{ 
		super(10);
	   System.out.println("B class No Constructor Argument");  	
	}
}
public class ConstructorSuper
{
	public static void main(String[] args)
	{
		B sc=new B();   //object
	}
}
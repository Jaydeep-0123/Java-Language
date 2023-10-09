class A     //parante class
{
	public A()  //constructor
	{  
		//By default Super() add kar leta h
		System.out.println("A class No Constructor Argument :");
	}
}
class B extends A   //child class
{
	public B()  //constructor
	{ 
	   //By default Super() add kar leta h
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

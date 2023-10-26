class A  //parent class
{
	public A(int a , int b)   //constructor  
	{  
		super();
		System.out.println("A class is Constructor Argument");
		System.out.println("The value of first constructor parameter :"+a);
		System.out.println("The value of second constructor parameter :"+b);
	}
}
class B extends A  //child class        
{
	public B()  //constructor        //Single Inheritance
	{   
		super(20 , 21);
		System.out.println("B class No Constructor Argument");
	}
}
public class ConstructorSuper1
{
	public static void main(String[] args)
	{
		B sc=new B();   //object
	}
} 
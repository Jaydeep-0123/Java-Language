class Father        //parent class(Super class)
{
	int balance=5000;
}
class Son extends Father   //child class(sub class)
{
	int balance=2000;

	 Son()   //constructor
	{
		System.out.println("son balance is : "+balance);
		System.out.println("father balance is : "+super.balance);
	}
}
public class SuperKeyword
{
	public static void main(String[] args)
	{
		Son s=new Son();
	}
}

class Supar     //parent class
{
    public void show()
    {
    	System.out.println("supar class show method");
    }
}
class Sub extends Supar  //child class
{
	public void show()
	{
		super.show();
		System.out.println("sub class show method");
	}
}
class Keyword
{
	public static void main(String[] args)
	{
		Sub s=new Sub();
		s.show();
	}
}

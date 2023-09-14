class Animals
{
     void eatMethod()
	{
	
		System.out.println("Animals eat");
		System.out.println("Dog eat");
	}
}

class Dog
{
	public static void main(String[] args)
	{
		Animals sc=new Animals();
		sc.eatMethod();
	}
}

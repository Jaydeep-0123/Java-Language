class Test
{
	public static void main(String[] args)
	{
		Dotask d=new Dotask();
		d.start();
		System.out.println("main----"+Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			System.out.println("main "+i);
		}
	}
}
class Dotask extends Thread
{
	public void run()
	{
		System.out.println("main----"+Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			System.out.println("doTask "+i);
		}
	}
}

//=============================================================================================

class Task 
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Jaydeep "+i);
		}
	}
}
public class Multithreding 
{
   public static void main(String[] args)
   {
   	for(int i=0;i<5;i++)
   	{
   		System.out.println("main "+i);
   	}
   	Task t=new Task();
   	t.run();
   }
} 
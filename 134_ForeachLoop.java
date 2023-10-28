import java.util.Scanner;
class ForeachLoop
{
	public void set(int n)
	{
       for(int i=1;i<=n;i++)
       	System.out.printf(i+" ");
	}
}

class Loop
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		ForeachLoop fl=new ForeachLoop();
		fl.set(n);
	}
}

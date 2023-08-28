import java.util.Scanner;
class Array
{
	public static void main(String[] args)
	{
		int a[]=new int[10];    //object
	
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("enter the"+" "+i+" "+"posotion element is = ");
			a[i]=sc.nextInt();
		}

        System.out.println("The array element are");
		for(int i=0;i<10;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
}
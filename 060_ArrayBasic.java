import java.util.Scanner;
class Array
{
	public static void main(String[] args)
	{
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
	}
}


class Basic
{
	public static void main(String[] args)
	{
        int a[]=new int[5];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
        	System.out.println("Enter the"+" "+i+" "+"position array element is ->");
        	a[i]=sc.nextInt();
        }

        System.out.println();
        System.out.println("The array element is : ");
        for(int i=0;i<5;i++)
        {
        	System.out.printf(a[i]+" ");
   
        }
	}
}	
		

class BasicArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();

		int array[]=new int[size];

        System.out.println("Enter the array element are : ");
		for(int i=0;i<size;i++)
		{
            array[i]=sc.nextInt();
		}

        System.out.println("The array element are = ");
		for(int i=0;i<size;i++)
		{
			System.out.printf(array[i]+" ");
		}
	}
}		
		

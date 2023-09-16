import java.util.Scanner;
class Grether
{
	public static void main(String[] args)
	{
      
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a first number");
         int a = sc.nextInt();
         System.out.println("enter a second number");
         int b = sc.nextInt();
         System.out.println("enetr a third number");
         int c = sc.nextInt();

         if(a>b && a>c)
            System.out.println("the grether is a"+" "+a);

         else if(b>a && b>c)
         	System.out.println("the grether is b"+" "+b);

         else
         	System.out.println("the grether is c"+" "+c);
	}
}

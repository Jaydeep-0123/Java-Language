import java.util.Scanner;
public class Swapping
{
	public static void main(String[] args)
	{
        Scanner jay=new Scanner(System.in);
        System.out.println("enter a first number");
        int a=jay.nextInt();
        System.out.println("enter a second number");
        int b=jay.nextInt();

        int swap=a;
               a=b;
            b=swap;

         System.out.println("the first swapping value is"+" "+a);
         System.out.println("the second Swapping value is"+" "+b);   
	}
}
import java.util.Scanner;
class Switch
{
	public static void main(String[] args)
	{
         int a,b,ch;
         int result=0;
         
         System.out.println("1.Addition\n 2.Substriction\n 3.Multiplication\n 4.Division\n 5.Modulas");
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number");
         a=sc.nextInt();
         System.out.println("Enter a number");
         b=sc.nextInt();
         System.out.println("Enter the choice");
         ch=sc.nextInt();

         switch(ch)
         {
         case 1:
         	result=a+b;
         	break;

         case 2:
         	result=a-b;
         	break;

         case 3:
            result=a*b;
            break;

         case 4:
            result=a/b;
            break;
         case 5:
            result=a%b;
            break;

         default:
         System.out.println("Enter only 1 to 5");
       }
       System.out.println("The result is : "+result);
	}
}
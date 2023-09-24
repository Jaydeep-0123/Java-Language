import java.util.Scanner;
class PositiveNum
{
	public static void main(String[] args)
	{
	int n;

	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	n=sc.nextInt();

	if(n>0)
		System.out.println(n+" "+"is positive number");
	else if(n<0)
		System.out.println(n+" "+"is Negative number");
	else
		System.out.println("the numbetr is Zero");

    }   

}

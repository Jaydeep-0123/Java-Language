import java.util.Scanner;
class Palindroam
{
	public static void main(String[] args)
	{
		int rem=0,rev=0;
       
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int n = sc.nextInt();
        int t=n;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		if(rev==t)
			System.out.print(t+" "+"is palindrom");
	     else
	     	System.out.print(t+" "+"is not palindrom");
	}
}

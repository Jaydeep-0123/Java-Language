import java.util.Scanner;
public class Carts
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a nummber");
		int cart=sc.nextInt();

		if(cart>=300 && cart<=500)
			cart=cart-20;

		else if(cart<300)
			cart=cart-40;

		else if(cart>500 && cart<=1000)
			cart=cart+100;

		else
			cart=cart+500;

		System.out.println("the bonus is"+" "+cart);
	}
}

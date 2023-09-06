import java.util.Scanner;
public class EligiableForVote
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();

	if(a>=18 && a<=80)
		System.out.println("Eligiable for vote");
	else
		System.out.println("Not Eligiable for vote");
    }
}


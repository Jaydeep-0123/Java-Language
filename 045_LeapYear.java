import java.util.Scanner;
public class LeapYear
{
	public static void main(String[] args)
	{
		int year;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		year=sc.nextInt();

		if(((year%4==0) && (year%100!=0))||(year%400==0))
			System.out.println(year+" "+"is leap year");
		else
			System.out.println(year+" "+"is not leap year");
	}
} 



//leap year saal me ek baar aata h
//2020 ek leap year h
//2024 ek leap year h
//2028 ek leap year h
//2027 ek not leap year h

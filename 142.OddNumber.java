

class OddNumber
{
	static void printOddNumber(int n)
	{
		/*for(int i=0;i<n;i++)
		{
			if(i%2!=0)
				System.out.println("The odd Number is : "+i+" ");
		}*/
		int i=0;
		while(i<n)
		{
			if(i%2!=0)
				System.out.println("The odd Number is : "+i);
			i++;
		}
	}
}
class Number
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();

		OddNumber.printOddNumber(n);
	}
}

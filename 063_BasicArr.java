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
		

class UserInputElement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Rows :");
		int rows=sc.nextInt();
		System.out.println("Enter the Coloum :");
		int coloum=sc.nextInt();

		int arr[][]=new int[rows][coloum];

        System.out.println("Enter the array element : ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<coloum;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<coloum;j++)
			{
				System.out.print(arr[i][j]);
			}

			System.out.println();
		}

	}
}

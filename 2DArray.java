import java.util.Scanner;
class TwoDArray
{
	public static void main(String[] args)
	{
		int a[][]={{1,2,3},{4,5,6}};
		
		for(int i=0;i<2;i++)    //for Rows
		{
			for(int j=0;j<3;j++)  //for Coloum
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}
}

//=========================================================================================


class SumArray
{
	public static void main(String[] args)throws Exception
	{
		int arr[][]={{2,4,6,8},{1,2,3,4},{4,5,7,8}};
		int sum=0;

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
               sum=sum+arr[i][j];
			}
		}
		System.out.println("The sum of 2d Array : "+sum);
	}
}


//=======================================================================================================

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
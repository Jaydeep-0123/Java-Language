class Twodigit
{
	public static void main(String[] args)
	{
		int arr[]={3,5,6,19,49};
		int i;

		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>9 && arr[i]<100)
			System.out.println("the two digit number is = "+arr[i]+" ");	
		}
	}
}
class Delete
{
	public static void main(String[] args)
	{
		int a[]={10,20,30,40,50,60};
		int size=a.length;
		int deleteindex = 2;

		for(int i=deleteindex;i<size-1;i++)
		{
			a[i]=a[i+1];
		}
		size--;
		{
			for(int i=0;i<size;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}
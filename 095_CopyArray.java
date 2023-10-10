public class CopyArray
{
	public static void main(String[] args)
	{
		int a[]={2,4,6,8,10};
		int b[]=new int[5];

		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(b[i]+" ");
		}
	}
}

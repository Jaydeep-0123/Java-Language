public class MiniSminiArray
{
	public static void main(String[] args)
	{
		int a[]={10,20,30,40,50};
		int mini=a[0];
		int smini=a[1];

		for(int i=1;i<5;i++)
		{
			if(a[i]<mini)
			{
				smini=mini;
				mini=a[i];
			}
			else if(a[i]<smini && a[i]!=mini)
			{
				smini=a[i];
			}
		}	
		System.out.println("mini "+mini);
		System.out.println("smini "+smini);
        
	}
}

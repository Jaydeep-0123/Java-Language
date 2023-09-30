class Basic
{
	public static void main(String[] args)
	{
        int a[]=new int[5];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
        	System.out.println("Enter the"+" "+i+" "+"position array element is ->");
        	a[i]=sc.nextInt();
        }

        System.out.println();
        System.out.println("The array element is : ");
        for(int i=0;i<5;i++)
        {
        	System.out.printf(a[i]+" ");
   
        }
	}
}	
		

class ReplaceVal
{
	public static void main(String[] args)
   {
		int a[]={1,2,3,4,5,6,7};
		int b=2;
		int rep=5;
       for(int i=0;i<a.length;i++)
       {
        	if (a[i]==b)
    	    {
    		a[i]=rep;
    	    }
    	System.out.print(a[i]+" ");
	   } 
   }	
}

class Array
{
	public static void main(String[] args)
 {
		int a[]={1,2,3,4,5};
		int mini=a[0];
       for(int i=0;i<a.length;i++)
       {
           if (mini>=a[i])
           {
    	   mini=a[i];
           }
       }
	System.out.println("the minimum number is"+" "+mini);
  }
}

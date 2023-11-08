class paliNum
{
	 public static void main(String[] args)
   {
	   String s="jaydeep";
     int i=0,c=0,h=s.length()-1;
     char ch[]=s.toCharArray();
     while(i<h)
     {
    	  if (ch[i]!=ch[h]) 
    	  {
    		 System.out.println(s+" "+"is not pallindrom");
    		 c=1;
    		 break;
    		
       }
    	   i++;
       	h--;
   }
 	    if(c==0)
 	    {
 	       System.out.println(s+" " +"is pallindrom");
       }	
    }
}

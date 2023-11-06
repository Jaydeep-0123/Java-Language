class StringReverse
{
	public static void main(String[] args)
	{
		String s = "jaydeep";

		System.out.println(revstr(s));
	}
	
	  static String revstr(String s)
	  {
	  	if(s.length()<=1)
	  	{
	  		return s;
	  	}
	     else
	     {
	     	return revstr(s.substring(1))+s.charAt(0);
	     }
	  }
}
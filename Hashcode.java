public class Hashcode
{
	public static void main(String[] args)
	{
       String s = "20";
       Test sc=new Test();    
       System.out.println(sc.hashCode());
       System.out.println(sc);
    }
}



class Hash
{
	public static void main(String[] args)
	{
		String name="jaydeep";
		String name1="kuldeep";

		System.out.println(name);
		System.out.println(name.hashCode());

		System.out.println(name1);
		System.out.println(name1.hashCode());

	}
}




class code
{
	public static void main(String[] args)
	{
		String s="10";
		String s1="20";

	    Student sc=new Student();
		System.out.println(sc.hashCode());
		System.out.println(sc);

		Test jay=new Test();
		System.out.println(jay.hashCode());
		System.out.println(jay);
	}
}




class Test
{
    public String toString()
    {
        return super.toString();
    }
    public static void main(String[] args)
     {
        Std t =new Std("jaydeep",100,"7724980826","indore");
        Std t1=new Std("kuldeep",101,"7489912877","bhopal");
        Std t2=new Std("sanjay",102,"9753630862","ujjain");
        System.out.println("the first student details are = "+" "+t);
        System.out.println("the second student details are = "+" "+t1);
        System.out.println("the third student details are = "+" "+t2);
    }
}
class Std
{
	String name;
	int roll;
	String mobile;
	String address;

	Std(String n,int r,String m,String a)    //constructor
	{
		name =n;
		roll=r; 
		mobile=m;
		address=a;

	}
	public String toString()
   {
     return name+","+roll+","+mobile+","+address;
	}
}

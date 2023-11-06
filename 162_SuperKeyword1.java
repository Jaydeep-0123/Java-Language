class ParentClass
{
	protected String name;
	protected String address; 
	protected int salary;

	ParentClass()  //constructor
	{
		name="jaydeep";
		address="indore";
		salary=6500;
	}
}	
class ChildClass extends ParentClass  
{
	protected String name;
	protected String address;
	protected String designation;
	protected int number;

	ChildClass()  //constructor
	{
		name="kuldeep";
		address="bhopal";
		designation="manager";
		number=111;
	}		

		public void showData()
	    {
	    	System.out.println("The name is : "+super.name);
	    	System.out.println("The address is : "+super.address);
	    	System.out.println("The salary is : "+salary);
	    	System.out.println("The name is : "+name);
	    	System.out.println("The address is : "+address);
	    	System.out.println("The desihnation is : "+designation);
	    	System.out.println("The number is : "+number);
	    }

}
public class SuperKeyword1
{  
	public static void main(String[] args)
	{
	ChildClass ch=new ChildClass();
	ch.showData();
    } 
}

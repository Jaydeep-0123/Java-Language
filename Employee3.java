class Employee
{
	String name;
	String address;   //instance variable and data member
	int salary;
	String designation;
	int number;

	public void accept()  //member function and behaviour
	{
        name="jaydeep";
        address="indore";
        salary=65000;
        designation="maneger";
        number=111;
	}
	public void show()
	{
      System.out.println("The employee name is = "+name);
      System.out.println("The employee address is = "+address);
      System.out.println("The employee salary is = "+salary);
      System.out.println("The employee designation is = "+designation); 
      System.out.println("The employee number is = "+number); 
      System.out.println();
	}
}
class Emp
{
	public static void main(String[] args)
	{
		Employee e1=new Employee(); //calling default constructor
		e1.show();
		e1.accept();
		e1.show();
	}
}
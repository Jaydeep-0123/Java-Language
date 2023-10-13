class Employee
{
	String name;
	String address;
	String designation;  //data member and property and instance variable
	int salary;
	int number;

	Employee()
	{
		name="jaydeep";
		address="indore";
		designation="doctor";
		salary=65000;
		number=111;
	}
	 public void show()
	{
      System.out.println("The employee name is = "+name);
      System.out.println("The employee  address is = "+address);
      System.out.println("The employee designation is = "+designation);
      System.out.println("The employee salary is = "+salary);
      System.out.println("The employee number is = "+number);
	}
}
class emp
{
	public static void main(String[] args)
	{
		Employee emp=new Employee();  //constructor
		emp.show();
	}
}

import java.util.Scanner;
class Employee
{
	String employee_name;
	String employee_address;   //data member and property of employee
	int employee_salary;
	String employee_designation;

	void takeinput()        //it is default
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee address");
		employee_address=sc.next();

		System.out.println("Enter the employee name");
		employee_name=sc.next();

		System.out.println("Enter the employee salary");
		employee_salary=sc.nextInt();

		System.out.println("Enter the employee designation");
		employee_designation=sc.next();

	}
	void printdetails()
	{
		takeinput();
		System.out.println();
		System.out.println("The employee details are = ");
		System.out.println("The employee address is : "+employee_address);
		System.out.println("The employee name is : "+employee_name);
		System.out.println("The employee salary is : "+employee_salary);
		System.out.println("The employee designation is : "+employee_designation);
	}
}
class Learn
{
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		//emp.takeinput();
		emp.printdetails();
	}
}

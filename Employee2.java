class Employee
{
    String name;
    int salary;
    String designation;   //data member and property
    String address;

    Employee(String n , int s , String d , String a)   //constructor
    {
    	name=n;
    	salary=s;
    	designation=d;
    	address=a;
    }
    void print()
    {
    	System.out.println("The employee name is = "+name);
    	System.out.println("The employee salary is = "+salary);
    	System.out.println("The employee designation is = "+designation);
    	System.out.println("The epmloyee address is = "+address);
        System.out.println();
    }

    public static void main(String[] args)
    {
    	Employee emp=new Employee("jaydeep" , 50000 , "maneger" , "indore");
    	emp.print();

        Employee emp1=new Employee("kuldeep" , 750000 , "doctor" , "ujjain");
        emp1.print();
    }
}

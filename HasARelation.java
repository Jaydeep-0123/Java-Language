class Maneger
{
	String manegerName;
    String manegerLocation;
    String manegerAddString
	public Maneger(String manegerName , String manegerLocation , String manegerAddress)
	{
		this.manegerName=manegerName;
		this.manegerLocation=manegerLocation;
		this.manegerAddress=manegerAddress;
	}
}
class Employee
{
	private String employeeName;
	private String employeeAddress;
	private String employeeDesignation;
	private Maneger maneger;

	public Employee(String employeeName , String employeeAddress , String employeeDesignation , Maneger maneger)
	{
	   this.employeeName=employeeName;
	   this.employeeAddress=employeeAddress;
	   this.employeeDesignation=employeeDesignation;
	   this.maneger=maneger;	
	}
	public void displayData()
	{
      System.out.println("Employee Name : "+employeeName);
      System.out.println("Employee Address : "+employeeAddress);
      System.out.println("Employee Designation : "+employeeDesignation);
      System.out.println("Maneger Name : "+maneger.manegerName);
      System.out.println("Maneger Location : "+maneger.manegerLocation);
      System.out.println("Maneger Address : "+maneger.manegerAddress);
	}

}
public class HasARelation
{
	public static void main(String[] args)
	{
		Maneger m1=new Maneger("Jaydeep" , "Indore" , "Barahwah");

		Employee e1=new Employee("Kuldeep" , "Ujjain" , "Doctor" , m1);
		e1.displayData();
	}
}
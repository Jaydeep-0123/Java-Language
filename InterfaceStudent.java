interface Student
{
	abstract public void acceptData();
	abstract public void showData();
}
abstract class Student1 //implements Student
{
	protected String studentName;
	protected String studentAddress;
	protected String studentCourse;
}
class BasicDetails  extends Student1 
{
    protected int studentRoll;
    protected int studentMarks;
    protected int studentNumber;
   
}
class HighDetails  extends BasicDetailsz implements Student
{
	protected String stuFatherName;
	protected String dateOfBirth;
	protected int studentFees;

	public void acceptData()
	{
		studentRoll=111;
    	studentMarks=98;
    	studentNumber=12;
		studentName="Jaydeep";
		studentAddress="Indore";
		studentCourse="BCA";
		stuFatherName="Sanjay Panwar";
		dateOfBirth="14-08-2003";
		studentFees=50000;
	}
	public void showData()
	{
		System.out.println("Student Name : "+studentName);
		System.out.println("Student Address : "+studentAddress);
		System.out.println("Student Course : "+studentCourse);
		System.out.println("Student Roll No : "+studentRoll);
		System.out.println("Student Marks : "+studentMarks);
		System.out.println("Student NUmber : "+studentNumber);
		System.out.println("Student Fathers Name : "+stuFatherName);
		System.out.println("Student Date Of Birth : "+dateOfBirth);
		System.out.println("Student Fees : "+studentFees);
	}
}
class InterfaceStudent
{
	public static void main(String[] args)
	{
		HighDetails h=new HighDetails();
		h.acceptData();
		h.acceptData();
		h.showData();
	}
}
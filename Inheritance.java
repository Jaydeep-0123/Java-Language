class Student //parant class
{
	protected String studentName;
	protected String studentAddress;
	protected int studentNumber;

	Student()
	{
		studentName="jaydeep";
		studentAddress="indore";
		studentNumber=111;
	}
}

class PeramanantStudent extends Student  //child class
{
	protected double studentMarks;
	protected String studentCourse;
	protected String schoolName;
	protected int studentRoll;

	public void acceptData()
	{
		studentRoll=1001;
		studentCourse="BCA";
		studentMarks=98;
		schoolName="N.V.V.H.S.S";
	}
	public void displayData()
	{
		System.out.println("The student name is : "+studentName);
		System.out.println("The student address is : "+studentAddress);
		System.out.println("The student number is : "+studentNumber);
		System.out.println("The student marks is : "+studentMarks);
		System.out.println("The student course is : "+studentCourse);
		System.out.println("The student school name is : "+schoolName);
		System.out.println("The student roll is : "+studentRoll);
	}
}
public class Inheritance
{
	public static void main(String[] args)
	{
		PeramanantStudent jay=new PeramanantStudent();
		jay.acceptData();
		jay.displayData();
	}
}
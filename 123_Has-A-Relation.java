class College
{
	String collegeName;
	String collegeLocation;

	public College(String collegeName , String collegeLocation)
	{
		this.collegeName=collegeName;
		this.collegeLocation=collegeLocation;
	}
}
class Student
{
	private String studentName;
	private int studentId;
	private College college;  //HAS-A-Relation

	public Student(String studentName , int studentId , College college)
	{
		this.studentName=studentName;
		this.studentId=studentId;
		this.college=college;
	}
	public void show()
	{
       System.out.println("Student Name : "+studentName);
       System.out.println("Student Id : "+studentId);
       System.out.println("Student College Name : "+college.collegeName);
       System.out.println("Student College Location : "+college.collegeLocation);
       System.out.println();
	}
}
class HasARelation
{
	public static void main(String[] args)
	{
		College c1=new College("KCI" , "Geeta Bhavan");

		Student s1=new Student("Jaydeep" , 111 , c1);
		s1.show();

		Student s2=new Student("Kuldeep" , 222 , c1);
		s2.show();
	}
}

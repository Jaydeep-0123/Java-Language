public class FunctionStudent
{
	 static void printdetails(int rollno , String name , String address)
	{
		System.out.println("roll no : "+rollno);
		System.out.println("name : "+name);
		System.out.println("address : "+address);
		System.out.println();
	} 
	public static void main(String[] args)
	{
       printdetails(1001 , "jaydeep" , "indore");
       printdetails(1005 , "kuldeep" , "ujjain");
       printdetails(1010 , "shivam" , "bhopal");
	}
}

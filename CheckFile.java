// encrept id and password in of our file
import java.util.Scanner;
import java.io.*;

class Id
{
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 Create File");
		System.out.println("Press 0 Show File");
		int press=sc.nextInt();
		System.out.print("Insert fileName here:-");
		String fileName=sc.next();


		//for insertion of Id and password
		if(press==1){
			System.out.println("insert file "+ fileName);
			System.out.println("Enter Id :");
			String id=sc.next();
			System.out.println("Enter password:");
			String pass=sc.next();
			inserFileData(fileName,id,pass);

			String data=incrept(fileName);
			ins(fileName,data);

	    }
	    else
	    {
	    	showFileData(fileName);
	    }		
	}
	public static String incrept(String fileName) throws Exception
	{
		FileReader fr=new FileReader(fileName);
		int a=fr.read();
		String s="";
		while(a!=-1)
		{
			//s=s+(char)(a);
			s=s+(char)(a+2);
			a=fr.read();
		}
		return s;
	}
	public static void ins(String fileName,String str)throws Exception
	{
		FileWriter fw=new FileWriter(fileName);
		fw.write(str);
		fw.close();
	}

	public static  void inserFileData(String fileName,String Id ,String Pass) throws Exception
	{
		FileWriter fw=new FileWriter(fileName);
		fw.write("Id :");
		fw.write(Id);
		fw.write("\n");
		fw.write("Password :");
		fw.write(Pass);
		
		fw.close();
	}
	public static void showFileData(String fileName) throws Exception
	{
		FileReader fr=new FileReader(fileName);
		int a=fr.read();
		while(a!=-1)
		{
			System.out.print((char)(a-2));
			a=fr.read();
		}
	}
}

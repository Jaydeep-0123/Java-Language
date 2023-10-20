import java.util.Scanner;
import java.io.* ;
class Merge
{
	public static void main(String[] args)throws Exception
	 {
		String str1="";
		String str2="";
		 Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter file one");
		String file1=sc.next();
		System.out.println("Please Enter Second File");
		String file2=sc.next();

		//Merge data in String 
		FileReader fr=new FileReader(file1);
		int  c=fr.read();
		while(c!=-1)
		{ 
			System.out.print((char)c);
			str1=str1 +(char)c;
			c=fr.read();
		}

		FileReader f=new FileReader(file2);
		int a=f.read();
		while(a!=-1)
		{

			str2=str2+(char)a;
			a=f.read();
		}

		//Create Merge file 
		System.out.println("\nEnter third fiel name ");
		String fileName=sc.next();
		FileWriter fw=new FileWriter(fileName);
		fw.write(str1);
		fw.write(str2);
		fw.close();
	
		
	}
}

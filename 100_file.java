/*
f1
f2
f1
f2
f1
f2
*/


import java.io.*;

class mergefile
{
	public static void main(String[] args) throws Exception{
		
		FileWriter fw1=new FileWriter("phone.txt");
		fw1.write("111");
		fw1.write("\n");
		fw1.write("222");
		fw1.write("\n");
		fw1.write("333");
		fw1.write("\n");
		fw1.write("444");
		fw1.write("\n");
		fw1.write("555");
		fw1.write("\n");
		fw1.write("666");
		fw1.write("\n");
		fw1.write("777");


		fw1.close();

		FileWriter fw2=new FileWriter("sim.txt");
		fw2.write("999");
		fw2.write("\n");
		fw2.write("888");
		fw2.write("\n");
		fw2.write("777");
		fw2.write("\n");
		fw2.write("666");
		fw2.write("\n");
		fw2.write("111");
		fw2.close();

		FileWriter fwl=new FileWriter("f1f2f1f2.txt");

		FileReader f1=new FileReader("phone.txt");
		FileReader f2=new FileReader("sim.txt");

		BufferedReader bf1=new BufferedReader(f1);
		BufferedReader bf2=new BufferedReader(f2);
		String str1=bf1.readLine();
		String str2=bf2.readLine();
		while(str1!=null || str2!=null)
		{
			if(str1!=null)
			{
			System.out.println(str1);
			str1=bf1.readLine();	
			}

			if(str2!=null)
			{
			System.out.println(str2);
			str2=bf2.readLine();
		    }
		}
		
	fwl.close();
	}
}

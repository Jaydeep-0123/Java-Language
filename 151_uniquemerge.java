//Merge  f1+f2
// all unique elementsin this file



import java.io.*;

class mergefile
{
	public static void main(String[] args) throws Exception{
		
		FileWriter fw1=new FileWriter("abc.java");
		fw1.write("111");
		fw1.write("\n");
		fw1.write("222");
		fw1.write("\n");
		fw1.write("444");
		fw1.write("\n");
		fw1.write("555");
		fw1.write("\n");
		fw1.write("999");
		fw1.close();

		FileWriter fw2=new FileWriter("abc.txt");
		fw2.write("333");
		fw2.write("\n");
		fw2.write("888");
		fw2.write("\n");
		fw2.write("777");
		fw2.write("\n");
		fw2.write("555");
		fw2.write("\n");
		fw2.write("222");
		fw2.close();

		FileWriter fwl=new FileWriter("Abc3.txt");

		FileReader f=new FileReader("abc.java");
		BufferedReader bf=new BufferedReader(f);
		int a=0,sum=0;
		String str=bf.readLine();
		while(str!=null)
		{
			a=Integer.parseInt(str);
			sum=0;
			
			
		
		FileReader fr=new FileReader("abc.txt");
		BufferedReader bf1=new BufferedReader(fr);
		int b=0;
		String st=bf1.readLine();
		while(st!=null)
		{
			b=Integer.parseInt(st);
			if(a==b)
				sum=1;
			st=bf1.readLine();
		}
		if(sum!=1)
			fwl.write(str +"\n");

		str=bf.readLine();
	}

		FileReader ffr=new FileReader("abc.txt");
		BufferedReader f1=new BufferedReader(ffr);
		String stt=f1.readLine();
		while(stt!=null)
		{
			fwl.write(stt+"\n");
			stt=f1.readLine();
		}
		
	
	fwl.close();
}


		


	
}

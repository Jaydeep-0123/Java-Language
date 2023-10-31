import java.io.*;
class Write
{
	public static void main(String[] args)throws Exception
	{
		FileWriter fw=new FileWriter("abc.txt");
		fw.write("100");
		fw.write("\n");
		char ch[]={'a','b','c'};
		fw.write("ch");
		fw.close();
	}
}

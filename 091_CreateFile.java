import java.io.File;
class CreateFile
{
	public static void main(String[] args)throws Exception
	{
		File f = new File("jaydeep");
		if(f.exists())
			System.out.println("file is exit");
		else
		{
			f.createNewFile();  //for create a file
		}
	}
}

class text
{
	public static void main(String[] args)throws Exception
	{
		File f = new File("jaydeep.txt");
		f.mkdir();  //for create a folder 
	}
}

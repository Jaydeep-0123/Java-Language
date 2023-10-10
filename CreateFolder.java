import java.io.File;
class CreateFolder
{
	public static void main(String[] args)throws Exception
	{
		File f = new File("jaydeep");
		if(f.exists())
			System.out.println("The folder is exit");
		else{
		f.mkdir();
	   }
	}
}
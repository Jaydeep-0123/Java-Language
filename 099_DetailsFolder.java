import java.io.File;
class Details
{
	public static void main(String[] args)throws Exception
	{
       File s=new File("c:\\java Language");
       if(s.exists())
       {
       	if(s.isDirectory())   //show folder
       	{
       		String name[]=s.list();
       		for(int i=0;i<name.length;i++)
       		{
       		    System.out.println(name[i]+"->"+"File");	
       		}
       	}
       
        }
       
	}
}

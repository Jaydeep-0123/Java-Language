import java.io.File;
class Detail
{
	public static void main(String[] args)throws Exception
	{
       File s=new File("c:\\java Language");
       	
       		String name[]=s.list();
       		for(int i=0;i<name.length;i++)
       		{
                File t=new File(name[i]);		    
       	
            if(t.isDirectory())
            {
                System.out.println(name[i]+"->"+"Folder");
            }    
                else{
                    System.out.println(name[i]+"->"+"File");
                    }
                
            }    
        
       
	}
}
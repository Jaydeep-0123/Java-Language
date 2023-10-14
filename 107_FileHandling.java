import java.io.*;
class Test{
	public static void main(String[] args)throws Exception 
	{
		Files(" ");
		//write(" ");
		
		
	}
	public static void Files(String name)throws Exception 
	{
		FileWriter fw=new FileWriter("C.txt");
        FileReader fr= new FileReader("A.txt");
       
		BufferedReader br=new BufferedReader(fr);
		String s=null;
		while((s=br.readLine())!=null)
		{
          /*fw.write(s+"\n");
          s=br.readLine();*/
         fw.write(s+"\n");
   
		}

		
		 FileReader fr1= new FileReader("B.txt");
       
		BufferedReader br1=new BufferedReader(fr1);
		String s1=null;
		while((s1=br1.readLine())!=null)
		{
			
         // System.out.println(s1);
          fw.write(s1+"\n");
         /* s1=br1.readLine();
          fw.write(s1+"\n");
         */
         
		}
		fw.close();
		//System.out.println("read 2 File");
		 FileReader fr2= new FileReader("C.txt");
       
		BufferedReader br2=new BufferedReader(fr2);
		String l=br2.readLine();
		while(l!=null)
		{
          System.out.println(l);
           
          l=br2.readLine();  
		}
	}      
public static void write(String name)throws Exception{
		PrintWriter pw=new PrintWriter("A.txt");
		pw.println(111);
		pw.println(222);
		pw.println(333);
		pw.println(444);
		pw.println(555);
        pw.close();
       
       PrintWriter pw1=new PrintWriter("B.txt");
	    pw1.println(222);
		pw1.println(666);
		pw1.println(555);
		pw1.println(444);

        pw1.close();


	}

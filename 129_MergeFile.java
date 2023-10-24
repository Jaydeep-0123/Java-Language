import java.io.*;

public class Merge
 {
    public static void main(String[] args) 
    {
        String File1 = "C:\\java Language\\abc.java";
        String File2 = "C:\\java Language\\AddString.java";
        String File3 = "C:\\java Language\\AllTable.java";
        
        try
        {
            File s1 = new File(File1);
            File s2 = new File(File2);
            File s3 = new File(File3);
            
            int data;
            while ((data=s1.read())!= -1) 
            {
                s3.write(data);
            }
            while ((data=s2.read())!= -1) 
            {
                s3.write(data);
            }
            s1.close();
            s2.close();
            s3.close();
            
            System.out.println("Files merged successfully.");
        }
         catch (Exception e) 
          {
            System.out.println("An error occurred: " + e.getMessage());
          }
    }
}

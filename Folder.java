class Fold2{

	public static void main(String[] args) throws Exception {
	write("abc.txt");
	//read("abc.txt");	
	}
	public static void read(String name)throws Exception {
		FileReader f=new FileReader(name);
		int a = f.read();
		while(a!=-1)
		{
	     	System.out.print((char)a);
	     	a=f.read();
		} 
	}
	public static void write(String name)throws Exception 
	{
		FileWriter f= new FileWriter(name);
      f.write("10");
      f.write("\n");
      f.write("'R'");
      f.write("\n");
      f.write("hellohiii\n");
      f.close();
	}
}

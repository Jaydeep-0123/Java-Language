class jaydeep 
{
         static void sum(int a,int b)
      {
         System.out.println("int");
        }
      static void sum(int a,byte b) 
      {
        System.out.println("byte");
        }
      static void sum(int a,float b) 
      {
          System.out.println("float");
        }
      static void sum(int a,Object b)
      {
          System.out.println("Object");
        }
      static void sum(int a,char b) 
      {
          System.out.println("char");
        }
        static void sum(int a,double b)
      {
          System.out.println("double");
        }
        static void sum(int a ,long b)
        {
           System.out.println("long");
        }
        public static void main(String[] args)//throws Exception 
        {
                
            sum(10,124);
        }
}

class Sample
{
        void m1()
        {
           System.out.println("P m1");
      }
      void m2()
      {
         System.out.println("P m2");
      }
}

class Sample1 extends Sample
{
        void m1()
        {
         System.out.println("aa");
      }
      void m3()
      {
         System.out.println("T m3");
   }
     Sample1()
   {
        this(10);
        System.out.println("Test ");
   }
   Sample1(int a)
   {
        System.out.println(a);
   }
        public static void main(String[] args) 
        {
                Sample1 ob=new Sample1();
                ob.m1();
                ob.m2();
                ob.m3();
        }       
}

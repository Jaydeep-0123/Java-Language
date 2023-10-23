class Super  //parent class
{
        void display()  
        {
                System.out.println("The method of Super Class");
        }
}
class Sub extends Super  //child class
{
      @Override
        void display()  //Method Overriding
        {  
                super.display();
                System.out.println("The method of Sub Class");
        }
}
class Main1
{
        public static void main(String[] args)
        {
                /*Super s=new Super();
                s.display();*/

                Sub s1;
                s1=new Sub();
                s1.display();
        }
}
//-----------------------------------------------------------------------------------------------

class Animal    //Parent Class
{
        public void eat()
        {
                System.out.println("I can't say");
        }
}
class Lion extends Animal  //Child Class
{      
        @Override
      public void eat()   //method overiding
      {
        System.out.println("Non Veg type");
      }
}
class Horse extends Animal
{
        public void eat()
        {
                System.out.println("veg type");
        }
}
class Main2
{
        public static void main(String[] args)
        {
       Animal a=new Horse(); //upcasting
       a. eat();
        }
}

//----------------------------------------------------------------------------------------------


class RBI
{
        public void loan()
        {
       System.out.println("Bank Should Provide Loane");
        }
}
class SBI extends RBI
{
        public void loan()
        {
                System.out.println("9.2%");
        }
}
class BOB extends RBI
{
        
        public void loan()
        {
                System.out.println("10.5%");
        }
}
public class MethodOveriding
{
        public static void main(String[] args)
        {
                RBI a=new SBI();   //upcasting
                a.loan();
        }
}

//--------------------------------------------------------------------------------------------------



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

//-----------------------------------------------------------------------------------------------------
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

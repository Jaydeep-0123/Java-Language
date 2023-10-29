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

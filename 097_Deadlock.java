class Test
{
  public static void main(String[] args)
  {
    //DataTask t=new DataTask(Thread.currentThread());
    DataTask t1=new DataTask(Thread.currentThread());
    t1.setName("end");
    t1.start();
    t1.currentThread().setName("start");
    /*try 
    {
     t1.join();
    }
    catch(Exception e)
    {
      System.out.println("exception hai.....");
    }*/
    for(int i=1;i<=5;i++)
    {
      t1.interrupt();
      System.out.println("main"+i+" :"+Thread.currentThread().getName());
    }
    }
 }

 class DataTask extends Thread {
   Thread t1=null;

  DataTask(Thread main)
  {
    t1= main;
  }
  public void run()
  {
    for(int i=1;i<=8;i++)
    {
      try 
      {
      t1.sleep(5000);
      }
      catch(Exception e)
      {
        System.out.println("So rha hu b!");
      }
      System.out.println("do task "+i+" :"+Thread.currentThread().getName());
      //Thread.setName("ABC");
   }
  }
}

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

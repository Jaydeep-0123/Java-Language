interface EatTable
{
   abstract public void eat();
}
interface DrinkTable
{
	abstract public void drink();  // multipal inheritance in interface
}
class Food implements EatTable,DrinkTable
{
	public void eat()
	{
		System.out.println("This is a eat table");
	}
	public void drink()
	{
		System.out.println("This is a  drink table");
	}
}
public class Interface
{
	public static void main(String[] args)
	{
		Food f=new Food();
		f.eat();
		f.drink();
	}
}
import java.util.Scanner;
class Car
{
	String colour;
	String name;    //property
	int price;

	public void takeinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the colour of car");
		colour=sc.next();
		System.out.println("Enter the name of car");
		name=sc.next();
		System.out.println("Enter the price of car");
		price=sc.nextInt();	
	}
	public void printCarDetails()
	{  
		System.out.println();
	        System.out.println("the details of car");
		System.out.println("the colour of car : "+colour);
		System.out.println("the name of car : "+name);
		System.out.println("the price of car : "+price);
	}
}
class learnJava
{
  public static void main(String[] args)
  {
  	Car sc=new Car();   //object
  	sc.takeinput();
  	sc.printCarDetails();
  }
}  

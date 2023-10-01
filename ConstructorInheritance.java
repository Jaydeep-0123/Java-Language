import java.util.Scanner;
class Shape
{
	protected int x;

	Shape(int x)
	{
		this.x=x;
		System.out.println("The value of x : "+x);
	}
}
class Square extends Shape
{
	Square(int y)
	{
		super(y);
	}
	public void areaOfSquare()
	{
		System.out.println("The area of square : "+x*x);
	}
}
public class ConstructorInheritance
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int area=sc.nextInt();

		Square s=new Square(area);
		s.areaOfSquare();
	}
}

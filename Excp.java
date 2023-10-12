class AgeException extends Exception
{
	AgeException(String msg)
	{
		super(msg);
	}
}
class Excep
{
	public boolean checkAge(int age)throws AgeException
	{
	  if(age<18)
	  {
        throw new AgeException("Age is less than 18:"+age);
	  }
	  return true;
	}
	public void voting(int age)
	{
		try
		{
		 if (checkAge(age)) {
		 	System.out.println("Welcome  ");
		 		
		 	}	
		}
		catch(Exception a)
		{
			System.out.println("your age not enough for voting age is 18 or 18+.");
		}
	}
}
public class Excp
{	
	public static void main(String[] args)
	{
		Excep e =new Excep();
		e.voting(19);
	}
}

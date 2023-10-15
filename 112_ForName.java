interface RBI
{
	abstract public void getInfo();
}
class SBI implements RBI
{
	public void getInfo()
	{
		System.out.println("SBI Info");
	}
	static{
		System.out.println("SBI Static");
	}
}
class PNB implements RBI
{
	public void getInfo()
	{
		System.out.println("PNB Info");
	}
	static{
		System.out.println("PNB static");
	}
}
class LENA implements RBI
{
	public void getInfo()
	{
		System.out.println("LENA Info");
	}
	static{
		System.out.println("LENA static");
	}
}
class DENA implements RBI
{
	public void getInfo()
	{
		System.out.println("DENA Info");
	}
	static{
		System.out.println("DENA static");
	}
}
public class ForName
{
	public static void main(String[] args) 
	{
		SBI s=new SBI();
		s.getInfo();

		PNB p=new PNB();
		p.getInfo();

		LENA l=new LENA();
		l.getInfo();

		DENA d=new DENA();
		d.getInfo();

	}
}

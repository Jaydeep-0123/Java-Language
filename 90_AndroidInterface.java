interface Android
{
	abstract public void makeVideoCall();
	abstract public void clikSelfi();
	abstract public void makeCall();
	abstract public void playGames();
	//abstract public void whatsApp();
	//abstract public void youtube(); 
}
class Samsung implements Android
{
	public void makeVideoCall()
	{
		System.out.println("The Detailsn of Samsung Phone :->");
		System.out.println("Samsung Phone Make Video Call");
	}
	public void clikSelfi()
	{
		System.out.println("Samsung Phone Clik Selfi");
	}
	public void makeCall()
	{
		System.out.println("Samsung Phone make Call");
	}
	public void playGames()
	{
		System.out.println("Samsung Phone play Games");
	    System.out.println();
	}    
}	


class Realme implements Android
{
	public void makeVideoCall()
	{
		System.out.println("The Detailsn of Realme Phone :->");
		System.out.println("Relame Phone Make Video Call");
	}
	public void clikSelfi()
	{
		System.out.println("Realme Phone Clik The Selfi");
	}
	public void makeCall()
	{
		System.out.println("Realme Phone make Call");
	}
	public void playGames()
	{
		System.out.println("Realme Phone play Games");
	    System.out.println();
	}    
}


class Oppo implements Android
{
	public void makeVideoCall()
	{
		System.out.println("The Detailsn of Oppo Phone :->");
		System.out.println("Oppo Phone Make Video Call");
	}
	public void clikSelfi()
	{
		System.out.println("Oppo Phone Clik The Selfi");
	}
	public void makeCall()
	{
		System.out.println("Oppo Phone make Call");
	}
	public void playGames()
	{
		System.out.println("Oppo Phone play Games");
     	System.out.println();
    } 	
}


class Redmi implements Android
{
	public void makeVideoCall()
	{
		System.out.println("The Detailsn of Redmi Phone :->");
		System.out.println("Redmi Phone Make Video Call");
	}
	public void clikSelfi()
	{
		System.out.println("Redmi Phone Clik The Selfi");
	}
	public void makeCall()
	{
		System.out.println("Redmi Phone make Call");
	}
	public void playGames()
	{
		System.out.println("Redmi Phone play Games");
	    System.out.println();
	}    
}

public class AndroidInterface
{
	public static void main(String[] args)
	{
		Samsung s=new Samsung();
		s.makeVideoCall();
		s.clikSelfi();
		s.makeCall();
		s.playGames();

		Realme r=new Realme();
		r.makeVideoCall();
		r.clikSelfi();
		r.makeCall();
                r.playGames();

		Oppo o=new Oppo();
		o.makeVideoCall();
		o.clikSelfi();
		o.makeCall();
		o.playGames();

		Redmi j=new Redmi();
		j.makeVideoCall();
		j.clikSelfi();
		j.makeCall();
		j.playGames();

	}
} 

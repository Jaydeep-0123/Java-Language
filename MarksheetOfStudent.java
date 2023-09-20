import java.util.*;
class Marksheet
{
	public static void main(String[] args)
	{
		float hindi,english,maths,science,s_science;
		float total,per;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hindi marks : ");
		hindi=sc.nextFloat();
		System.out.println("Enter the english marks : ");
		english=sc.nextFloat();
		System.out.println("Enter the maths marks : ");
		maths=sc.nextFloat();
		System.out.println("Enter the science marks : ");
		science=sc.nextFloat();
		System.out.println("Enter the social s marks : ");
		s_science=sc.nextFloat();

        total = hindi+english+maths+science+s_science;
        per = (total/500)*100;

        System.out.println("The student Total marks is = "+total);
        System.out.println("The student percentage is = "+per);

        if(per>=75)
        	System.out.println("The student pass in first division");
        else if(per<75 && per>=60)
        	System.out.println("The student pass in second division");
        else if(per<60 && per>=45)
        	System.out.println("The student pass in third division");
        else if(per<45 && per>=33)
        	System.out.println("The student pass in fourth division");
        else
            System.out.println("The student is fail");

        
	}
}
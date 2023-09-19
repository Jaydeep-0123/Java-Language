class Student
{
    int roll;
    String name;     //the property of student
    double per;

    Student(int r , String n , double p)    //constructor
    {
        roll = r;
        name = n;
        per = p;
    }

    void printDetails()
    {
        System.out.println("ROLL : "+roll);
        System.out.println("name : "+name);
        System.out.println("per :"+per);
        System.out.println();
    }

    boolean isPass()
    {
        if(per>33)
        return true;
        else
         return false;
    }    
}

class LearnJava
{
       public static void main(String[] args)
   {
        Student st1 = new Student(100 , "kuldeep" , 92);
        st1.printDetails();
        boolean checkPass = st1.isPass();
        System.out.println("is Student passed : "+checkPass);

        Student st2 = new Student(200,"jaydeep" , 65);
        st2.printDetails();
        boolean cPass = st2.isPass();
        System.out.println("is Student passed : "+cPass);

        
    }
}
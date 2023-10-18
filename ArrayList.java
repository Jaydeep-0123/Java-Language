import java.util.ArrayList;
class Array
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
        
        for(int n:list)  //for each loop
        	System.out.println(n);
       // int element=list.get(0); //get index element 
       // System.out.println(element);
	
      
       /*list.add(5,60);    //add element

		//list.set(2,3);  //set element 

		//list.remove(2); //delete element;

		int size=list.size();    //for Remove Size
		System.out.println(list);
		System.out.println(size);*/
	}		
}

//============================================================================================================


class StringArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();

		list.add("jaydeep");
		list.add("Kuldeep");
		list.add("shivam");
		list.add("rohan");

		System.out.println(list);

		String delete=list.remove(3);
		System.out.println(delete);
		System.out.println(list);

		list.add(1,"surypal");
		System.out.println(list);
	}
}



//================================================================================================================


class Array1
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		System.out.println(list);

		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Hello");
		list1.add("Java");
		list1.add("Programming");

		System.out.println(list1);
	}
}		
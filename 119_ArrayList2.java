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



class Emp
{
	static String id ;
	String name ;
	double sal ;
	static int count ;
	static String cname ="TCS";
	{
		id=cname+ ++count;
	}
	public void Display() 
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
		System.out.println();
		
	}
}

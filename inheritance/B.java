class A 
{
	public static void name() 
	{
		System.out.println("Hello World!");
	}
}
class B extends A
{
	public static void main (String []args)
	{
		System.out.println(A.name());
	}
}
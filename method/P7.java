//METHOD OVERLOADING 
// WAJP to print addition of two numbers , three numbers& four numbers . Create independent methods & return the respective addition

class P7 
{
	public static void main(String[] args) 
	{
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		System.out.println(add(10,20,30,40));
	}
	public static int add(int a, int b)
	{
		return a+b ;
	}
	public static int add(int a, int b ,int c)
	{
		return a+b+c ;
	}
	public static int add(int a, int b ,int c , int d)
	{
		return a+b+c+d ;
	}

}

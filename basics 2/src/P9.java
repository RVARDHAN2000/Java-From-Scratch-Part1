// INDIRECT METHOD RECURSION 
//

class  P9
{
	public static void main(String[] args) 
	{
		System.out.println("Hello main");
		test();
		System.out.println("bye main");
	}
     public static void test() 
	{
		System.out.println("Hello test");
		print();
		System.out.println("bye test");
	}
	  public static void print() 
	{
		System.out.println("Hello print");
		test();
		System.out.println("bye print");
	}
}


/*
Hello main
Hello test
Hello print
Hello test
Hello print
Hello test
Hello print
Hello test
Hello print
Hello test
Hello print
.
.
*/
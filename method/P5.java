//WAJP to find largest of three number 
class P5
{
	public static void main(String[] args) 
	{
		large (15,30,40);
	}
	public static void large (int a, int b , int c) 
	{
		int res = a>b ? ( a>c ? a : c ):( b>c ? b : c);

		System.out.println("largest of the three number is "+res);
	}

}




//largest of the three number is 40
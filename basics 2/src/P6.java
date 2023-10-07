// RETURN
//// WAJP to print a 10*20+50=250 by using methods

class  P6
{
	public static void main(String[] args) 
	{
		int res = mul(10,20);
		int result = add(res, 50);
		System.out.println("The result of the expression is "+result);
	}
	public static int mul(int a, int b) 
	{
		int res=a*b;
		return res;
	}
	public static int add(int res, int d)
	{
		int result=res+d;
		return result;
	}

}



//The result of the expression is 250




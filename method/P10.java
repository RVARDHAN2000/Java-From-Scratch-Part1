// WAJP to print the numbers from 1 to 5 without using the loops 

class P10 

{
	public static void main(String[] args) 
	{
		print(1);
		
	}
	public static void print(int a) 
	{
		System.out.println(a);
		a++;
		if (a<=5)
		{
			print(a);
		}
	}
}


/*
1
2
3
4
5
*/
//To check whether the given number is strong number or not 

class P1

{
	public static void main(String[] args) 
	{
		int n=146;
		int temp=n;
		int sum=0;
		while (n>0)
		{
			int prod=1;
			int rem =n%10;
			while (rem>0) 
			{
				prod=prod*rem;
				rem--;
			}
			sum = prod+sum;
			n=n/10;	
		}
		if (sum==temp)
			{
				System.out.println("The given number "+temp+" is a strong number");
			}
			else 
			System.out.println("The given number "+temp+" is not a strong number");  //The given number 146 is not a strong number
			
	}
}

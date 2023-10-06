class P11 
{
	public static void main(String[] args) 
	{
		Sheela(21);
	}
    public static void Sheela(int a) 
	{
		System.out.println(a);
		a++;
		if (a<=25)
		{
			Sheela(a);
		}
		System.out.println(a);
	}
}


/*

21
22
23
24
25
26
25
24
23
22


*/
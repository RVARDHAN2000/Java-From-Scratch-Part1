class  P2
{
	public static void main(String[] args) 
	{
		int a=1; 
		int b=2;
		int c=3;
		int x=( a > b ) ? (a > c ? a : c ) : ( b > c ? b : c ) ;
		System.out.println("The largest of " +a+" , "+b+" and "+c+ " is "+x); 
	}
}

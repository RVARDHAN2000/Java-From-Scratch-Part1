package competion;

public class P2 {
public static void main(String[] args) {
	int n=9;
	int space=n-1;int star=1;
	for(int row=1;row<=n;row++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print("  ");
		}
		for(int j=1;j<=star;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		if (row<=n/2)
		{
			space--;
			star+=2;
		}
		else
		{
			space++;
			star-=2;
		}
	}
		
}
}

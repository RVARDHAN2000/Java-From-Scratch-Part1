package competion;

public class P1 {
	public static void main(String[] args) {
		int n=5;
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<n;col++)
			{
				if(col==n/2||row==n/2||row==col||row+col==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	

}

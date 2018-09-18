
public class ChesssBoard {
	public static void chesspattern()
	{
		int a[][]=new int[8][8];
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print("ww");
					System.out.print("\t");
				}
				else
				{
					System.out.print("bb");
				    System.out.print("\t");
				}
			}
			System.out.print("\n");
		}
		
	}
public static void main(String args[])
{
	chesspattern();
}
}

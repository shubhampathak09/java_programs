import java.util.Scanner;

public class MatrixAdd {
	public static void main(String args[])
	{
	addMatrix();	
	}
	public static void addMatrix()
	{
		int m,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Ënter the rows of the matrix:-");
		m=s.nextInt();
		System.out.println("Enter the coloumns of the matrix:-");
		n=s.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		System.out.println("Input the Elements of first matrix:-");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				a[i][j]=s.nextInt();
		}
		System.out.println("Input the Elements of Second matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				b[i][j]=s.nextInt();
		}
		System.out.println("Sum of matrices:-");
		for(int k=0;k<m;k++)
		{
			for(int l=0;l<n;l++)
			{
				System.out.print(a[k][l]+b[k][l]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		
	}

}

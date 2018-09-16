import java.util.Scanner;

public class ArraySum {

	private int n;
	private int[] array=new int[n];
	public void getinput(int n)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of inputs");
		n=s.nextInt();
		for(int i=0;i<n;i++)
			array[i]=s.nextInt();
	}
}

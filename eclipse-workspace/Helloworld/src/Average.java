
public class Average {
//	private int[]=new int[10];
	private int input;
	private int sum;
	private int average;
	private int count;
	public Average()
	{
		average=0;
		sum=0;
		count=0;
	}
	public void getInput(int x)
	{
		input=x;
		sum+=x;
		count++;
	}
	public int calculateAverage()
	{
		return sum/count;
	}
	public void display()
	{
		System.out.printf("The average is %d", calculateAverage());
	}

}

import java.util.Scanner;

public class Power {
	// to check if given number is power of 4
public static int pow(int n)
{
	int remain=n;
			int flag=0;
			boolean b=remain!=0||remain!=1||remain!=2||remain!=3;
	while(b)
	{
		remain=remain/4;
	}
	if(remain==0)
		flag=1;
	if(flag==1)
	{
		System.out.println("power of 4");
		return 1;
	}
	else
	{
		System.out.println("Not a power 4");
		return 0;
	}
}
public static void main(String[] args)
{
	int n;
	System.out.println("Enter the number that you want to check for power of 4");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	pow(n);
}
	
}

import java.util.Scanner;

public class StudentMraks {
	private int numOfStudents;
	private int array[]=new int[numOfStudents];
	public void GetNoStudents()
	{
		System.out.println("Enter the no of students");
		Scanner s=new Scanner(System.in);
		numOfStudents=s.nextInt();
	}
	public void EnterGrades()
	{
		System.out.println("Enter Grades one by one");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<numOfStudents;i++)
			array[i]=s.nextInt();
	}
	public void ChechGrades(int a[],int n)
	{
		n=numOfStudents;
		for(int i=0;i<n;i++)
		{
			if(a[i]>100||a[i]<0)
			{
				throw new IllegalStateException("Grades cant be less than 0 or more than 100");
			}
		}
	}
public static void main(String args[])
{
	StudentMraks s=new StudentMraks();
	s.GetNoStudents();
	s.EnterGrades();
}
}

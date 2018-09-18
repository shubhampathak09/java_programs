
public class Consecutive {
	public static void isort(int a[],int n)
	{
//		n=a.length;
		int i,j,key;
		for(i=1;i<n;i++)
		{
			j=i-1;
			key=a[i];
			while(j>=0&&key<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
			
	}
	public static void check(int a[],int n)
	{
		int count=0;
		for(int i=0;i<n-1;i++)
		{   
			 
			if(a[i+1]-a[i]==1)
			{
				count++;
			}
		}
	//	System.out.println(n);  7
	//	System.out.println(count);
		if(count==n-1)
			System.out.println("Consecutive numbers");
		else
			System.out.println("Not consecutive");
	}
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6,6};
		int b[]= {98,96,95,94,93};
		int c[]= {54,53,52,51,50,49,48};
		int n=a.length;
		
	//	isort(b,n);
	//	System.out.print("\n");
	//	isort(c,n);
	//	System.out.print("\n");
		isort(a,n);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);
			System.out.print("\t");
		}
		System.out.print("\n");
		check(a,n);
	}

}

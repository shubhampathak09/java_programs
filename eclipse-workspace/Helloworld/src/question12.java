
public class question12 {
	public static int foo(int a,String s)
	{
		s="yellow";
		a=a+2;
		return a;
	}
	public static void bar()
	{
		int a=3;
		String s="blue";
		a=foo(a,s);
		System.out.println("a="+ a + "s="+s);
	}
	public static void main(String args[])
	{
		bar();
	}

}

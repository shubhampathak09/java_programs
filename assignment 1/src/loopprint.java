import java.util.Scanner;
public class loopprint {
    public static void printloop(int n)
    {
        for(int i=1;i<=n;i++)
            for(int j=1;j<=i;j++)
                System.out.print(i);
           }
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner((System.in));
        System.out.println("enter the value of iteration..");
        n=s.nextInt();
        printloop(n);
    }
}

import java.util.Scanner;

public class prime_or_not {
    public static void checkprime(int n)
    {
        if(n<0)
        {
            System.out.println("please enter a positive value");
        }
        int flag=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(n==1||n==0)
        {
            flag=2;
        }
        if(flag==0)
            System.out.println("Given number is prime");
        else
            System.out.println("Given number is not prime");
    }
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Input the number you ant to check for prime");
        n=s.nextInt();
        checkprime(n);
    }
}

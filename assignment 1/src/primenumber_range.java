import java.util.Scanner;

public class primenumber_range {
    public static void main(String args[])
    {
      //  int count=0;
        int i,j,n;
        System.out.println("Enter your the element till which you want to print primes...");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=2;i<=n;i++)
         {
             int count=0;
            for( j=1;j<=i;j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count==2)
                System.out.println(i);
        }

    }
}

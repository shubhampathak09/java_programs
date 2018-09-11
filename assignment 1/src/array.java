import java.util.Scanner;

public class array {
    public static void main(String args[])
    {
        int N;
        System.out.println("Enter the size of array");

        Scanner s=new Scanner(System.in);
        N=s.nextInt();
        int[]a=new int[N] ;
        System.out.println("Enter the elements into the array");
        for(int i=0;i<N;i++)
            a[i]=s.nextInt();
    }
}

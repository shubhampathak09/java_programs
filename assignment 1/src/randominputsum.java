import java.util.Scanner;

public class randominputsum {
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of inputs..");
        n=s.nextInt();
        int[] array=new int[10];
        int sum=0;
        System.out.print("next enter the inputs one by one");
       for(int i=0;i<n;i++)
       {
           array[i]=s.nextInt();
           sum+=array[i];
       }
       System.out.print("The sum of inputs is..");
       System.out.println(sum);
    }
}

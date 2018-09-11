import java.util.Random;
import java.util.Scanner;

public class random_target {
    public static void main(String args[])
{
    Random rand = new Random();

    int n = rand.nextInt(50) + 1;  // random number generated using rand class function
  //  System.out.println(n);
    int target;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a the target number");
    target=s.nextInt();

    do
    {
     if(target<n) {
         System.out.println("Target is more than expected value,Enter again");
         target = s.nextInt();
     }
     else if(target>n) {
         System.out.println("Target is less than expected value,Enter a again");
         target = s.nextInt();
     }
     else
         System.out.println("Goodjob values match");  // some error over here some insight???

    }
    while(target!=n);
   if(target==n)
        System.out.println("Good job values match");
}
}

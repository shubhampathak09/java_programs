import java.util.Scanner;
public class palindrome {
    public static int reverse(int p)  //function to reverse a number
    {
        int temp=p;
        int rev=0;
        int rem;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        return rev;
    }
    public static void checkpalindrome(int n)       //main functiom that checks for palindrome and calls two sub helper function
    {
        int m=reverse(n);
        if(m==n) {

            System.out.print("the given number is palindrome ");
            int w=evensum(n);
            if(w<25)
                System.out.println("And the sum of even numbers is less than 25 ");
            else
                System.out.println("And the sum of even numbers is greater than 25");

        }
        else
            System.out.println("the given number is not a palindrome");


    }
    public static int evensum(int n)    //Function that calculates sum of even digits in palindrome
    {
        int sum=0;
        int r;
        while(n!=0)
        {
            r=n%10;
            if(r%2==0)
                r+=r;
            n=n/10;
        }
        return sum;
    }

 public static void main(String args[])
 {
        int i;
        Scanner s=new Scanner(System.in);
        System.out.print("enter any number");
        i=s.nextInt();
        checkpalindrome(i);



 }
}

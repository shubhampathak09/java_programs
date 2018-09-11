import java.util.Scanner;
public class ifesle {
    public static int ascii(char c)
    {
        int as= c;
        return as;
    }
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("enter any number"); //input number
        n=s.nextInt();                        //for integer data type
        if((n%2)==0&&n>20&&n<30)              // This condition check whether the input number is between 20 and 30 and even
        {
            System.out.println("Jerry");      //Print jerry if the above condition true
        }
        if((n%2)!=0&&n>20&&n<30)
            System.out.println("Tom");      //prints tom if teh above condition fails in matching the number to even.
    }
}

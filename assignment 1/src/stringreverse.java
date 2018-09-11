import java.util.Scanner;

public class stringreverse {
    public static void main(String args[])
    {
        String input;
        Scanner s1=new Scanner(System.in);
        System.out.print("enter the string");
        input=s1.nextLine();
        System.out.print("the original string is..");
        System.out.println(input);
         int i=input.length()-1;
        while(i>=0)
         {
             char ch=input.charAt(i);
             System.out.print(ch);
             i--;
         }

  //   System.out.println(i);
    }

}

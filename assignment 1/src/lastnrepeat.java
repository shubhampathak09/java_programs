import java.util.Scanner;

public class lastnrepeat {
    public  static void main(String args[])
    {
     String s1;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the string");
        s1=sc.nextLine();   //stores the string variable
     //   System.out.println(s1);
        int n;
        System.out.println("enter the integer");
        Scanner p=new Scanner(System.in);
        n=p.nextInt();  //stores the integer parameter
        System.out.print(s1);
        // repeat n times
        for(int j=0;j<n;j++) {
            for (int i = s1.length() - n; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                System.out.print(ch);
            }
        }
    }
}

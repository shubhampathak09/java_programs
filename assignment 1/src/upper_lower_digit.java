import java.util.Scanner;

public class upper_lower_digit {
    public static void main(String args[]) {


            char a;
        Scanner s = new Scanner(System.in);
        System.out.println("enter a character");
        a = s.next().charAt(0);
        // System.out.print(a);
        if (65 <= a && a <= 90)  //ascii values in uppercase
            System.out.println("Given character is in uppercase");
        else if (97 <= a && a <= 122)   ///ascii values in lower case
            System.out.println("Given character us in lowercase");
        else if (48 <= a && a <= 57)   //for digits
            System.out.println("Given character is digit");
        else
            System.out.println("Given character is a special symbol");       //remaining for symbols


    }

}

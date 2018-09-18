import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThrow {
	public static void main(String[] args) throws IllegalArgumentException,InputMismatchException{
	    boolean flag = true;
	    Scanner in = new Scanner(System.in);
	    do{
	        try{
	            System.out.println("Please enter the number:");
	            int n = in.nextInt();
	            int sum = n*(n-1)/2;
	            System.out.println("sum = " + sum);
	            flag = false;
	        }
	        catch(IllegalArgumentException e){
	            System.out.println(e.getMessage());
	        }
	        catch(InputMismatchException e){
	            System.out.println("The number has to be as integer...");
	            in.nextLine();
	        } 
	    }
	}
}


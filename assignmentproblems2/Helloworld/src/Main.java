import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args)
	{ 
		 int choice=0;
		 Scanner S=new Scanner(System.in);
		 Recipe Recipeobj=new Recipe();
		 while(choice !=4)
		 {
			 if(choice>4)
				 System.out.println("Invalid choice");
			 System.out.println("Enter Choice");
			 System.out.println("Enter 1 for adding recipes");
			 System.out.println("Enter 2 for getting ingredients");
			 System.out.println("Enter 3 for displaying the recipes list");
			 System.out.println("Enter 4 for to exit");
			 choice=S.nextInt();
			 switch(choice)
			 {
			 case 1:
				 System.out.println("inside case 1");
			//	 Recipeobj.addRecipes();
				 break;
			 case 2:
				 System.out.println("inside case 2");
			//	 Recipeobj.getIngredients();
				 break;
			 case 3:
			//	 Recipeobj.displayRecipes();
				 break;
				 default:
					 break;
			 }
			 
		 }
	}

}

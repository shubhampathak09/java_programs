
import java.util.Scanner;

public class Recipe {
	
	private int n ;//quantity of reciepes
    private String[] array_recipe=new String[n]; //for recipe list
	private int ig; //amount of ingredients
	private String[] array=new String[ig];    //for ingredient list
	public Recipe()
	{
		 n=10;
		 ig=10;
	}
	public void getIngredients()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of ingredients");
		ig=s.nextInt();
		System.out.println("Enter the ingredients one by one:-");
		for(int i=0;i<ig;i++)
			array[i]=s.nextLine();
	}
	public void getRecipies()
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of recipes..");
		n=s.nextInt();
		int l=array_recipe.length;
		if(n>l)
			System.out.println("invalid amount of recipes,pls enter a valid amount");
		
		 displayRecipes();
	}
	private void displayRecipes()
	{
		int l=array_recipe.length;
		for(int i=0;i<l;i++)
		System.out.println(array_recipe[i]);
	}
	public void addRecipes()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("add your recipes here...");
		for(int j=0;j<n;j++)
			array_recipe[j]=s.nextLine();
	}
	boolean checkEmpty()
	{
		if(n==0)
			return true;
		else
			return false;
	}
}

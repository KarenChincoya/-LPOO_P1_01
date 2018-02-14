import java.util.Scanner;

public class TestSandwich {
     public static void main(String[] args) {
        String mainIngredient, breadType;
        Double price;
        Scanner input = new Scanner(System.in);
        Sandwich mySandwich = new Sandwich();
        System.out.println("Input the main ingredient: ");
	mainIngredient = input.nextLine();
        System.out.println("Input the bread type: ");
	breadType = input.nextLine();
        System.out.println("Input the price: ");
	price = input.nextDouble();
        mySandwich.setMainIngredient(mainIngredient);
        mySandwich.setBreadType(breadType);
        mySandwich.setPrice(price);
        mySandwich.getMainIngredient();
        mySandwich.getBreadType();
        mySandwich.getPrice();
     }     
 }
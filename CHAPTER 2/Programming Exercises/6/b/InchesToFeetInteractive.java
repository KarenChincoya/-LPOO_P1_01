import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inches;
        System.out.println("How many inches do you want to convert? ");
        inches = input.nextInt();
        System.out.println(inches + " inches becomes "+ (inches/12) + " feet and "+ (inches%12) + " inches");
    } 
}
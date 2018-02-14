import java.util.Scanner;

public class ProjectedSalesIntectives {
    static final double INCREMENT = 0.10;
    public static void main(String[] args) {
        double salesNorth, salesSouth;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the North division's sales of this year: ");
        salesNorth = input.nextFloat();
        System.out.print("Input the South division's sales of this year: ");
        salesSouth = input.nextFloat();
        System.out.println("The next year’s projected sales for North Division is " + (salesNorth*(1.0+INCREMENT)) +" dollars");
        System.out.println("The next year’s projected sales for South Division is " + (salesSouth*(1.0+INCREMENT)) +" dollars");
    } 
}
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;
        System.out.println("What's the temperature in Fahrenheit? ");
        fahrenheit = input.nextDouble();
        celsius = (fahrenheit-32.0)/1.8;
        System.out.print("The temperature in celsius is: "+celsius+"\n");
    } 
}
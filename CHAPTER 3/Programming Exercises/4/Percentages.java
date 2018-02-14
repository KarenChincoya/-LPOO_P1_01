import java.util.Scanner;

public class Percentages {
     public static void main(String[] args) {
        Double x;
        Double y;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        x = input.nextDouble();
        System.out.println("Input the second number: ");
        y = input.nextDouble();
        Number n = new Number(x,y);
        n.computePercent(x,y);
    } 
}
public class Number {
    Double x;
    Double y;
    public Number(Double x, Double y){
        this.x = x;
        this.y = y;
    }
    public void computePercent(Double x, Double y){
    //displays the 2 values, the value of the 1st number as a percentage of the second
        double p;
        p = x*(100.0/y);
        System.out.println(x +" is "+p+" % of "+y);
    }
}

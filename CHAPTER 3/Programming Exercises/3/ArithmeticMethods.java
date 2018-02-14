import java.util.Scanner;

public class ArithmeticMethods {
    public static void main(String[] args) {
        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        x = input.nextInt();
        System.out.println("Input the second number: ");
        y = input.nextInt();
        Number n1 = new Number(x);
        Number n2 = new Number(y);
        n1.displayNumberPlus10();
        n1.displayNumberPlus100();
        n1.displayNumberPlus1000();
        n2.displayNumberPlus10();
        n2.displayNumberPlus100();
        n2.displayNumberPlus1000();
    } 
}
public class Number {
    Integer x;
//pass each value to
    public Number(Integer x){
        this.x = x;
    }
    public void displayNumberPlus10(){
        System.out.println(x+" + 10 = "+ (x+10));
    }
    public void displayNumberPlus100(){
        System.out.println(x+" + 100 = "+ (x+100));
    }
    public void displayNumberPlus1000(){
        System.out.println(x+" + 1000 = "+ (x+1000));
    }    
}

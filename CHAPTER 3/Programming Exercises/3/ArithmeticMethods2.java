public class ArithmeticMethods2 {
    public static void main(String[] args) {
        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        x = input.nextInt();
        System.out.println("Input the second number: ");
        y = input.nextInt();
        Number n = new Number(x,y);
        n.displayNumberPlus10(x,y);
        n.displayNumberPlus100(x,y);
        n.displayNumberPlus1000(x,y);
    } 
}
public class Number {
    Integer x;
    Integer y;
    public Number(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }
    public void displayNumberPlus10(Integer x, Integer y){
        System.out.println(x+" + 10 = "+ (x+10));
        System.out.println(y+" + 10 = "+ (y+10));
    }
    public void displayNumberPlus100(Integer x, Integer y){
        System.out.println(x+" + 100 = "+ (x+100));
        System.out.println(y+" + 100 = "+ (y+100));
    }
    public void displayNumberPlus1000(Integer x, Integer y){
        System.out.println(x+" + 1000 = "+ (x+1000));
        System.out.println(y+" + 1000 = "+ (y+1000));
    }    
}
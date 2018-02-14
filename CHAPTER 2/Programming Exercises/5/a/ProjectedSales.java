public class ProjectedSales {
    static final double INCREMENT = 0.10;
    public static void main(String[] args) {
        double salesNorth=4000, salesSouth=5500;
        System.out.println("The next year’s projected sales for North Division is " + (salesNorth*(1.0+INCREMENT)) +" dollars");
        System.out.println("The next year’s projected sales for South Division is " + (salesSouth*(1.0+INCREMENT)) +" dollars");
    } 
}

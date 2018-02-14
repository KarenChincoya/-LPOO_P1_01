import java.util.Scanner;

public class PaintCalculator {
     public static void main(String[] args) {
        Integer x0;
        Integer x1;
        Integer x2;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the length: ");
        x0 = input.nextInt();
        System.out.println("Input the width: ");
        x1 = input.nextInt();
        System.out.println("Input the wheight: ");
        x2 = input.nextInt();
        Paint p = new Paint(x0, x1, x2);
        p.wallArea();
    }     
}
public class Paint {
    Integer length;
    Integer width;
    Integer height;

    public Paint(Integer length, Integer width, Integer height){
           this.length = length;
           this.width = width;
           this.height = height;
    }
    public void  wallArea(){
	Integer a, g, p;
	a = 2*(length*height)+2*(width*height);//total area
	g = gallons(a);
	System.out.println("Number of gallons needed:  " + g);
	//compute the price of $32 per gallon
	p = price(g);
	System.out.println("The cost to paint the room is: $"+p);
    }
    private Integer price(Integer p){
	return p*32;
    }
    private Integer gallons(Integer a){
	Integer total, resi;
	resi = a%350;
	total = a/350;
	if(resi>0)
		total++;
	return total; 
    }
}

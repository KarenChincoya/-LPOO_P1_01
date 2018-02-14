import java.util.Scanner;

public class Insurance {
     public static void main(String[] args) {
        Integer current;
        Integer birth;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the current year: ");
        current = input.nextInt();
        System.out.println("Input your birth year: ");
        birth = input.nextInt();
        Amount a = new Amount(current, birth);
        a.principal();
    }     
}
public class Amount {
    Integer current;
    Integer birth;
    
    public Amount(Integer current, Integer birth){
        this.current = current;
        this.birth = birth;
    }
    public void principal(){
        Integer pa;
        System.out.println("Annual policy premiums");
        pa = premiumAmount();
        System.out.println("The premium amount is: "+ pa);
    }
    private Integer premiumAmount(){
        Integer age;
        age = this.current - this.birth;
        return (((age-(age%10))/10) + 15 )*20;
    }
}

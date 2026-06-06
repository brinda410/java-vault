package ShoppingCart;
import java.util.Scanner;
public class shopCart {
    public static void main(String[]main){
        Scanner sc=new Scanner(System.in);
        String item;
        double price;
        int quantity;
        float total;
        char currency='$';

        System.out.println("What would you like to buy?:");
        item=sc.next();
        System.out.println("Price of each:");
        price=sc.nextDouble();
        System.out.println("How many would you like to buy?:");
        quantity=sc.nextInt();
        total=(float)price*quantity;
        System.out.println("The total is:"+total);
        System.out.println("You brought "+quantity+" "+item+" for "+currency+ ""+price+" each.And your total bill is "+currency+""+total);

        sc.close();
    }
    
}

package RandomNoGen;
import java.util.Random;
public class randNoGenerator {
    public static void main(String[]args){
        Random random=new Random();
        int number1;
        int number2;
        //rolling 2-dice
        number1=random.nextInt(1,7);
        number2=random.nextInt(1,7);
        System.out.println(number1);
        System.out.println(number2);

    }    
}

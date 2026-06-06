package GuessNumber;
import java.util.Random;
import java.util.Scanner;
public class guessNo {
    public static void main(String[]args){
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int guess;
        int attempts=0;
        int randomNumber=random.nextInt(1,101);

        System.out.println("Random Number Guessing game");
        System.out.println("Guess a no from 1-100");
        
        do{
            System.out.println("Enter your guess:");
            guess=sc.nextInt();
            attempts++;
            if(guess<randomNumber){
                System.out.println("Guess is low!Try again.");
            }else if(guess>randomNumber){
                System.out.println("Guess is high!Try again.");
            }else{
                System.out.println("Guess is correct.The number was:"+randomNumber);
                System.out.println("Number of guess:"+attempts);
            }
            

        } while(guess!=randomNumber);

        sc.close();

    }
    
}

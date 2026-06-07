package RockPaperScissorsGame;
import java.util.Scanner;
import java.util.Random;

public class rpsGame {
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        String[]choices={"rock","paper","scissor"};
        String playerChoice;
        String playAgain="yes";

        do{
        System.out.println("Enter your move(rock,paper,scissor):");
        playerChoice=sc.nextLine().toLowerCase();
        if(!playerChoice.equals("rock") &&
            !playerChoice.equals("paper") &&
            !playerChoice.equals("scissor")){
        System.out.println("Invalid choice");
        continue;
    }
    String compChoice=choices[random.nextInt(3)];
    System.out.println("The computer choice is:"+compChoice);

    if(playerChoice.equals(compChoice)){
        System.out.println("Its a tie");
    }else if(playerChoice.equals("rock") && compChoice.equals("scissor")){
        System.out.println("you winn");
    }else if(playerChoice.equals("paper") && compChoice.equals("rock")){
        System.out.println("you winn");
    }else if(playerChoice.equals("scissor") && compChoice.equals("paper")){
        System.out.println("you winn");
    }else{
        System.out.println("you loose");
    }
    System.out.println("Do you want to play again(Yes/No):");
    playAgain=sc.nextLine().toLowerCase();
     }while(playAgain.equals("yes"));
     sc.close();
}
}


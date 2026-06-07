package QuizGame;
import java.util.Scanner;
public class QuizGame {
    public static void main(String[]args){
        String[] questions={"What is the capital of Australia?",
                            "Which planet is known as the Red Planet?",
                            "Who wrote the play Romeo and Juliet?",
                            "What is the largest ocean on Earth?",
                            "Which programming language is primarily used for Android app development?"
                    };
        String[][] options={{"1.Melbourne","2.Perth","3.Sydney","4.Canberra"},
                          {"1.Venus","2.Mars","3.Earth","4.Jupiter"}, 
                          {"1.Charles Dickens","2.William Shakespeare","3.Mark Twain","4.Jane Austen"}, 
                          {"1.Atlantic Ocean","2.Indian Ocean","3.Arctic Ocean","4.Pacific Ocean"},
                          {"1.Python","2.Java","3.PHP","4.Ruby"}
                        };
        int[] answers={4,2,2,4,2};
        int score=0;
        int guess;
        Scanner sc=new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("Welcome to the quiz game:");
        System.out.println("****************************");
        for (int i=0;i<questions.length;i++){
            System.out.println(questions[i]);

            for(String option:options[i]){
                System.out.println(option);
            }
            System.out.println("Enter your guess:");
            guess=sc.nextInt();

            if(guess==answers[i]){
                System.out.println("***************");
                System.out.println("Correct");
                System.out.println("***************");
                score++;
            }else{
                 System.out.println("***************");
                System.out.println("Wrong");
                System.out.println("***************");
            }

        }System.out.println("The final score is "+score+" out of "+questions.length);
         sc.close();

      }
    
}

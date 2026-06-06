package madlibsGame;
import java.util.Scanner;
public class madLibs {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter noun(animal/bird):");
        String noun=sc.next();
        System.out.println("Enter pronoun:");
        String pronoun=sc.next();
        System.out.println("Enter an adjective(describing word):");
        String adjective=sc.next();
        System.out.println("Enter an adjective(describing word):");
        String adjective1=sc.next();
        System.out.println("Enter verb(action):");
        String verb=sc.next();

        System.out.println("A "+ noun+" guarded the entrance of the kingdom.");
        System.out.println(pronoun+" carried a "+adjective+" sword into battle.");
        System.out.println("An "+adjective1+" forest surrounded the castle.");
        System.out.println("The hero"+verb+" the evil sorcerer");

        sc.close();
    }
}

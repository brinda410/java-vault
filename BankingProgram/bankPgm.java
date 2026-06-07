package BankingProgram;
import java.util.Scanner;
public class bankPgm {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
       
        double balance=10000;
        boolean isRunning=true;
        int choice;
        while(isRunning){
        System.out.println("Banking Program");
        System.out.println("1.Show Balance");
        System.out.println("2.Deposit amount");
        System.out.println("3.Withdraw amount");
        System.out.println("4.Exit");
       
        System.out.println("Enter choice:");
        choice=sc.nextInt();
        switch(choice){
            case 1:showBalance(balance);
            break;
            case 2:balance=balance+deposit();
            break;
            case 3:balance=balance-withdraw(balance);
            break;
            case 4:isRunning=false;
            break;
            default:System.out.println("Invalid choice");
            break;
            }
        }System.out.println("Thank youu!Have a nice day");
        sc.close();
    }
    static void showBalance(double balance){
        System.out.println("The balance is:"+balance);
    }
    static double deposit(){
        double amount;
        System.out.println("Enter the amount to be deposited:");
        amount=sc.nextDouble();
        if(amount<0){
            System.out.println("Balance in neagative");
            return 0;
        }else{
            return amount;
        }
    }
    static double withdraw(double balance){
        double amount;
        System.out.println("Enter the amount to be withdrawn:");
        amount=sc.nextInt();

        if(amount>balance){
            System.out.println("Insufficient balance");
            return 0;
        }else if(amount <0){
            return 0;
        }else{
            return amount;
        }
    }

}


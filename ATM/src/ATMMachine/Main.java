package ATMMachine;

import java.util.Scanner;

class ATM{

    float Balance;
    int PIN = 7706;

    public void checkPin(){

        System.out.println("Enter your pin: ");
        Scanner scan = new Scanner(System.in);
        int enteredPin = scan.nextInt();
        if(enteredPin == PIN){
            menu();
        }

        else{
            System.out.println("Enter a valid Pin");
            menu();
        }

    }

    public void menu(){

        System.out.println("Enter your choice: ");
        System.out.println("1. Check A/C Balance: ");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner scan = new Scanner(System.in);
        int opt = scan.nextInt();

        if(opt == 1){

            checkBalance();
        }

        else if(opt == 2){

            withDrawMoney();
        }

        else if(opt == 3){

            depositMoney();
        }

        else if(opt == 4){

            return;
        }

        else{

            System.out.println("Enter a valid choice");
        }
    }

    public void checkBalance(){

        System.out.println("Balance: "+Balance);
        menu();
    }

    public void withDrawMoney(){

        System.out.println("Enter amount to Withdraw ");
        Scanner scan = new Scanner(System.in);
        float amount = scan.nextFloat();

        if(amount > Balance){

            System.out.println("Insufficient Balance");
        }

        else{

            Balance = Balance-amount;
            System.out.println("Money Withdrawal Successful");
        }

        menu();

    }

    public void depositMoney(){

        System.out.println("Enter the Amount: ");
        Scanner scan = new Scanner(System.in);
        float amount = scan.nextFloat();
        Balance = Balance+amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}

public class Main {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkPin();
    }
}
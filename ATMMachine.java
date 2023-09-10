package ATMMachine;

import java.util.Scanner;

class ATM {

    float Balance;

    int PIN = 1234;

    public void checkpin() {
        System.out.println("enter your pin:");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("enter vaild pin");
        }
    }

    public void menu() {
        System.out.println("Eneter your choice");
        System.out.println("1. Check your account Balance");
        System.out.println("2. Withdraw your money");
        System.out.println("3. Deposite your money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            CheckBalance();
        } else if (opt == 2) {
            WithdrawMoney();
        } else if (opt == 3) {
            DepositeMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a vaild choice");

        }
    }

    public void CheckBalance() {
        System.out.println("Balance:" + Balance);
        menu();
    }

    public void WithdrawMoney() {
        System.out.println("Enter amount to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient funds");
        } else {
            Balance = Balance - amount;
            System.out.println("MOney Withdrawl successfully");
        }
        menu();

    }

    public void DepositeMoney() {
        System.out.println("Enter amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money deposited sucessfully");
    }

}

public class ATMMachine {
    public static void main(String args[]) {

        ATM obj = new ATM();
        obj.checkpin();

    }
}
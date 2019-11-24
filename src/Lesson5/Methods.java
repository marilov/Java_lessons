package Lesson5;

public class Methods {

    public static void main(String[] args) {

        BankAccount bA = new BankAccount();
        System.out.println(bA.popolnenieScheta(5));
        System.out.println(bA.snytieSoScheta(7));
    }

    static class BankAccount {
        int balance = 10;

        int popolnenieScheta(int plus) {
            balance += plus;
            return balance;
        }

        int snytieSoScheta(int minus) {
            balance -= minus;
            return balance;
        }


    }
}

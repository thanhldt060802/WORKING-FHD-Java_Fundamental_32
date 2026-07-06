package bai12;

public class Main {
    public static void main(String[] args) {
        
        ATM atm = new ATM();
        atm.showAllAccounts();

        System.out.println();

        atm.login("123456A", "12345678");

        atm.withdraw(100000);
        atm.showAllAccounts();

        System.out.println();

        atm.logout();

        atm.withdraw(100000);
        atm.showAllAccounts();

    }
}
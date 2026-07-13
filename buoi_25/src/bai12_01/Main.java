package bai12_01;

public class Main {
    public static void main(String[] args) {
        
        // src\\bai12\\text.txt -> src\bai12\text.txt
        // src/bai12/text.txt
        // DataFileHandling dataFileHandling = new TextFileHandling("src\\bai12\\text.txt");
        // ATM atm = new ATM(dataFileHandling);

        // atm.addAccount(new Account("minhduc", "27112008", 300));
        // // atm.addAccount(new Account("linh", "4444", 3400));
        // // atm.removeAccountById("linh");
        
        // atm.login("minhduc", "27112008");
        // // atm.recharge(200);
        // // atm.withdraw(100);

        // atm.transfer("tanthanh", 200);
        // atm.logout();


        
        DataFileHandling dataFileHandling = new BinaryFileHandling("src/bai12/text.dat");
        ATM atm = new ATM(dataFileHandling);

        // atm.addAccount(new Account("tanthanh", "12345678", 300));
        // atm.addAccount(new Account("hoangphuc", "123AA321", 500));
        // atm.addAccount(new Account("hoangtam", "def123xyz", 200));

        atm.showAllAccounts();

        atm.addAccount(new Account("minhduc", "27112008", 300));

        atm.login("minhduc", "27112008");

        atm.transfer("tanthanh", 200);

        atm.logout();

        // atm.removeAccountById("tanthanh");
        
    }
}
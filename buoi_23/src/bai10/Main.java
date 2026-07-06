package bai10;

public class Main {
    public static void main(String[] args) {

        // PaymentMethod pay1 = new CashPayment("3301", 174.372);
        // pay1.processPayment();

        // System.out.println();
        // System.out.println();

        // PaymentMethod pay2 = new CreCardPayment("0001", 124.3, "123456", "minh duc", "27-11-2020");
        // pay2.processPayment();

        // System.out.println();
        // System.out.println();

        // PaymentMethod pay3 = new EWalletPayment("3618", 67.69, "967284", "paypal");
        // pay3.processPayment();

        // System.out.println();
        // System.out.println();

        // PaymentMethod pay4 = new BankTransferPayment("2634", 100, "390528395582", "MB bank");
        // pay4.processPayment();

        // System.out.println();
        // System.out.println();

        // PaymentMethod pay5 = new MobilePayment("3333", 253.45, "0972801127", "viettel");
        // pay5.processPayment();

        // System.out.println();
        // System.out.println();

        // PaymentMethod pay6 = new CryptoPayment("8472", 0, "746234", "don't know");
        // pay6.processPayment();

        PaymentMethod pay;
        String type = "cash";

        double amount = 50000;
        String transactionId = "9999";

        switch (type) {
            case "cash":
                pay = new CashPayment(transactionId, amount);
                break;

            case "credit":
                pay = new CreCardPayment(transactionId, amount, "123456", "minh duc", "27-11-2020");
                break;

            default:
                return;
        }

        pay.processPayment();

    }
}